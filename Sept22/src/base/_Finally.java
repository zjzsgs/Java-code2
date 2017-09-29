package base;

public final class _Finally {  
    public static void main(String[] args) {  
        try {  
            throw new NullPointerException();  //手动抛出一个异常
        } catch (NullPointerException e) {  
            System.out.println("程序抛出了异常");  
        } finally {  
            System.out.println("执行了finally语句块");  
        }  
    }  
}  