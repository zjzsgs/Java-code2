package base;

public final class _Finally {  
    public static void main(String[] args) {  
        try {  
            throw new NullPointerException();  //�ֶ��׳�һ���쳣
        } catch (NullPointerException e) {  
            System.out.println("�����׳����쳣");  
        } finally {  
            System.out.println("ִ����finally����");  
        }  
    }  
}  