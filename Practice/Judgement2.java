import java.util.*;
public class Judgement2{
	public static void main(String[] args){
		System.out.print("整数を入力>>");
		int number=new Scanner(System.in).nextInt();
		boolean isnumberJudgement=isjudgement(number);
		if(isnumberJudgement){
			System.out.printf("%dは0以上20以下です。%n",number);
		}else{
			System.out.printf("%dは0以上20以下ではありません。%n",number);
		}
	}
	public static boolean isjudgement(int isnumberA){
	if(isnumberA>=0 && isnumberA<=20){
			return true;
		}else{
			return false;
		}
	}
}

