package base;

import java.util.StringTokenizer;

public class Split {

	/**
	 * ��-�ָ���ַ���ת������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String orgStr = "2017-12-23";
		
		String[] str = orgStr.split("-");// ������ʽ
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);

		StringTokenizer tokener = new StringTokenizer(orgStr, "-");//��"-"��Ϊ�ָ��־��Ȼ��ѷָ�õ��ַ�����StringTokenizer����
		String[] result = new String[tokener.countTokens()];//ͨ��StringTokenizer ���countTokens���������������쳣֮ǰ���Ե��ô� tokenizer �� nextToken �����Ĵ�����
		int i = 0;
		while (tokener.hasMoreTokens()) {//������ tokenizer ���ַ������Ƿ��и���Ŀ��ñ�ǡ�
			result[i++] = tokener.nextToken();
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		System.out.println(orgStr.length());//String.length()
		System.out.println(result.length);//Array.length

	}

}
