import java.util.*;
public class Math{
	public static void main(String[] atgs){
		System.out.print("数字を入力>>");
		double numberA =new Scanner(System.in).nextInt();
		System.out.print("数字を入力>>");
		double numberB =new Scanner(System.in).nextInt();
		double answer=math(numberA,numberB);
		System.out.println(numberA+"円の"+numberB+"%Offは"+answer+"円です");
	}
	public static double tax(double numberA,double numberB){
		
	}
}
