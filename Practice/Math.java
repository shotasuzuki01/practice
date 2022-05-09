import java.util.*;
public class Math{
	public static void main(String[] atgs){
		System.out.print("数字を入力>>");
		double numberA =new Scanner(System.in).nextInt();
		System.out.print("数字を入力>>");
		double numberB =new Scanner(System.in).nextInt();
		double answer=math(numberA,numberB);
	//	System.out.println(numberA+"円の"+numberB+"%Offは"+answer+"円です");
		System.out.println(numberA+"の"+numberB+"%は"+answer+"です。");
	}
	public static double math(double numberA, double numberB){
	//	double answer=numberA-numberA*(numberB/100);
		double answer=(numberA/10)*numberB/10;
		return answer;
	}
}

