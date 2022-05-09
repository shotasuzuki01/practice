import java.util.*;
public class Display{
	public static void main(String[] args){
		System.out.print("先頭の整数を入力>>");
		int numberA=new Scanner(System.in).nextInt();
		System.out.print("末尾の整数を入力>>");
		int numberB=new Scanner(System.in).nextInt();

		boolean isans=isjudgement(numberA,numberB);
		if(isans){
			System.out.print(isans+" ");
		}else{
			System.out.print(isans+" ");
		}
	}
	public static boolean isjudgement(int numberA,int numberB){
		if(numberA>numberB){
			for(int i=numberA;i<numberB+1;i++){
				return true;  
			}
		}else{
			for(int i=numberA;i<numberB+1;i++){
				return false;
			}
		}
	}
}

