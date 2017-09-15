package base;
//堆内存溢出
import java.util.ArrayList;
public class HeapOut {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		while(true){
			//一直往内存里new
			list.add(new HeapOut());
		}
	}
}
