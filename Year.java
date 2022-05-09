import java.util.*;
public class Year{
	public static void main(String[] args){
		System.out.println("年号を入力してください");
		int year = new Scanner(System.in).nextInt();

		if(year%400==0 || year%100 != 0 && year%4==0){
			System.out.println(year+"はうるう年です");
		}else{
			System.out.println(year+"はうるう年ではありません");
		}
	}
}

