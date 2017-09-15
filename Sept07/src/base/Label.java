package base;

public class Label {
	public static void main(String[] args) {
		label:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 7; j++) {
					if(j==2){
						break;//中断j循环 i+1
					}
					if(j==3){
						continue;//跳过 执行j=4
					}
					if(j==1){
						continue label;//调到外部 继续执行
					}
					if(j==0){
						break label;//跳到外部 终止
					}
					System.out.println(i*j);
				}
			}
	}
}
