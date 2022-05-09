import java.util.*;
public class Step{
	public static void main(String[] args){
		System.out.print("何段");
		int num=new Scanner(System.in).nextInt();
		ans(num);
	}
	public static void ans (int numberA){
		for(int i=0; i<numberA+1;i++){
			for(int j=0; j<i; j++){
				return System.out.print("*");
			}
			System.out.println();
		}
	}
}


