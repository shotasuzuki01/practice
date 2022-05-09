import java.util.*;
public class Test2{
	public static void main(String[] args){
		int[] number = new int[10];

		for(int i=0; i<10; i++){
			int ram =new Random().nextInt(6)+1;
			number[i]=ram;
		}
		System.out.println(Arrays.toString(number));
	}
}

