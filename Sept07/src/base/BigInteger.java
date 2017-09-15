package base;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigInteger {

	private char sign='0';//��ʾ���� 0��ʾ���� -��ʾ����
	private byte[] data;//��ʾ��ֵ�Ķ�������
	
	public BigInteger(){
		this.data="0".getBytes();
	}
	
	public BigInteger(String value) throws Exception{
		//������ʽ �����ַ���Ҫ��0������1��-��ͷ ���඼������
		Pattern pattern = Pattern.compile("^-?\\d+$"); 
		if(value==null||value.length()<=0){
			value="0";
		}
		Matcher matcher = pattern.matcher(value);
		if(!matcher.find()){
			throw new Exception("The value is not a number string:"+value);
		}
		char firstChar = value.charAt(0);
		
		if(firstChar=='-'){
			if(value.length()>=2){
				sign=firstChar;
				value=value.substring(1);
				value=getTemp(value);
			}
		}else{
			value=getTemp(value);
		}
		this.data=value.getBytes();
	}
	private String getTemp(String value) {
		Pattern pattern = Pattern.compile("[^0]{1}");
		Matcher matcher = pattern.matcher(value);
		if(matcher.find()){
			value=value.substring(matcher.start());
		}else{
			value="0";
		}
		return value;
	}

	public BigInteger add(BigInteger other) {  
		BigInteger result = new BigInteger();  
        int thisLength = this.data.length;  
        int otherLength = other.data.length;  
        int shorterLength = thisLength > otherLength ? otherLength : thisLength;  
        ArrayList<Byte> resultData = new ArrayList<Byte>();  
        int flag = 0;  //��ʾ���ʱ�� ��λ�������ʱ�� ��λ  
        int i = thisLength - 1;  
        int j = otherLength - 1;  
        int k = shorterLength;  
  
        //�������ķ�����ͬ  
        if (other.sign == this.sign) {  
            //�����������ĸ�λ��ʼ�������  
            while (k > 0) {  
                Integer temp = new Integer(new String(new byte[]{this.data[i]})) + new Integer(new String(new byte[]{other.data[j]})) + flag;  
                flag = temp / 10;  //��ӽ������10ʱ�Ľ�λ��û�г���10����λΪ 0  
                resultData.add(0, ((temp % 10) + "").getBytes()[0]);  //����ӽ����������  
                k--;  
                i--;  
                j--;  
            }  
            //�Ѷ����λ���뵽�����  
            if (i == -1) {  
                while (j >= 0) {  
                    Integer temp = new Integer(new String(new byte[]{other.data[j]})) + flag;  
                    flag = temp / 10;  
                    resultData.add(0, ((temp % 10) + "").getBytes()[0]);  
                    j--;  
                }  
            } else if (j == -1) {  
                while (i >= 0) {  
                    Integer temp = new Integer(new String(new byte[]{this.data[i]})) + flag;  
                    flag = temp / 10;  
                    resultData.add(0, ((temp % 10) + "").getBytes()[0]);  
                    i--;  
                }  
            }  
            //����flag�ӽ������  
            if (flag != 0) {  
                for (byte by : (flag + "").getBytes()) {  
                    resultData.add(0, by);  
                }  
            }  
            result.sign = other.sign;  
        } else {  //���Ų�ͬ  
            if (thisLength > otherLength) {  //˵��this��ʾ����������ֵ���������ս���ķ���Ϊthis�ķ���  
                result.sign = this.sign;  
                resultData = subtract(this.data, other.data);  //ִ�м���  
            } else if (thisLength < otherLength) {  //other��ʾ����������ֵ���������ս���ķ���Ϊother�ķ���  
                result.sign = other.sign;  
                resultData = subtract(other.data, this.data);  
            } else {  //����������ݵ�λ����ͬ  
                Integer thisInt = 0;  
                Integer otherInt = 0;  
                //�ӵ�һλ��ʼ�Ƚϣ�ֱ�����߲����  
                for (int n = 0; n < thisLength; n++) {  
                    thisInt = new Integer(new String(new byte[]{this.data[n]}));  
                    otherInt = new Integer(new String(new byte[]{other.data[n]}));  
                    if (!thisInt.equals(otherInt)) {   //ע������Ҫʹ��equals��������Ϊ������Ҫ�Ƚϵ������ߵ�����  
                        break;  
                    }  
                }  
  
                //���this�ľ���ֵ��  
                if (thisInt > otherInt) {  
                    result.sign = this.sign;  
                    resultData = subtract(this.data, other.data);  
                } else {  
                    result.sign = other.sign;  
                    resultData = subtract(other.data, this.data);  
                }  
            }  
        }  
        result.data = new byte[resultData.size()];  
        for (int m = 0; m < resultData.size(); m++) {  
            result.data[m] = resultData.get(m);  
        }  
        return result;  
    }  
  
    private ArrayList<Byte> subtract(byte[] larger, byte[] smaller) {  
        ArrayList<Byte> resultData = new ArrayList<Byte>();  
        int flag = 0;  
        int i = smaller.length - 1;  
        int j = larger.length - 1;  
        int k = smaller.length;  
        while (k > 0) {  
            Integer temp = new Integer(new String(new byte[]{larger[j]})) + flag - new Integer(new String(new byte[]{smaller[i]}));  
            if (temp < 0) { //���������С��0��˵����Ҫ��λ�����flag��Ϊ -1���Ա���һλ��ȥ  
                flag = -1;  
                temp += 10;  
            } else {       //��������㣬��Ҫ��flag��Ϊ 0.��Ҫ������  
                flag = 0;  
            }  
            resultData.add(0, (temp + "").getBytes()[0]);  
            j--;  
            i--;  
            k--;  
        }  
        //����Ĵ���Ͳ�дע����  
        while (j >= 0) {  
            Integer temp = new Integer(new String(new byte[]{larger[j]})) + flag;  
            if (temp < 0) {  
                flag = -1;  
                temp += 10;  
            } else {  
                flag = 0;  
            }  
            resultData.add(0, (temp + "").getBytes()[0]);  
            j--;  
        }  
        return resultData;  
    }  
  
  
    @Override  
    public String toString() {  
        String str = new String(this.data);  
        str = getTemp(str);  
        if (sign == '-' && str !="0") {  
            str = sign + str;  
        }  
        return str;  
    }  
  
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String a1 = "-5453450543044355356576980545345054545453453454344435353254545345054304435535657698087756454543454345454534534543444353532545453450543044355356454543454354353450136546534534545345345054353450136546534534545345345043044355356576980657698087756454543454354353450136546534534545345345054353450136546534534545345345043044355356576980877564545434543543534501877564545434543543534501";  
        String b1 = "4545453453454344435353254545345054304435535657698087756454543454354345454534534543444353532545453450543044355356576980877564545434545454534534564545434543543534501365465345345453453450543534501365465345345453453450430443553565769804344435353254545345054304435535657698087756454543454354353450136546534534545345345043543534501365465345345453453450534501365465345345453453450";  
        BigInteger a = new BigInteger(a1);  
        BigInteger b = new BigInteger(b1);  
        BigInteger c = a.add(b);  
        System.out.println(c);  
        BigInteger a2 = new BigInteger(a1);  
        BigInteger b2 = new BigInteger(b1);  
        BigInteger c2 = a2.add(b2);  
        System.out.println(c2);  
        System.out.println(c2.toString().equals(c.toString())); 
	}

}
