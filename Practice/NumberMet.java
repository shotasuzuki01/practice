import java.util.*;
public class NumberMet{
	public static void main(String[] args){
			int Num1 = selectNum(5);
		System.out.printf("選ばれた数字は%dです%n",Num1);
	}
	public static int selectNum(int number){
		System.out.print("1~5の整数を入力>>");
			int answer = new Scanner(System.in).nextInt();
			return answer;
	}
}
