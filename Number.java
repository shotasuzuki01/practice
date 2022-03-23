import java.util.*;
public class Number{
	public static void main(String[] args){
		System.out.println("入力してください");
		int number = new Scanner(System.in).nextInt();

		if(number==0){
				System.out.println("優");
		}else if(number==1){
			System.out.println("良");
		}else if(number==2){
			System.out.println("可");
		}else{
			System.out.println("不可");
		}
	}
}

