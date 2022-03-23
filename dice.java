import java.util.*;
public class Dice{
	public static void main(String[] args){
		int diceA = new Random().nextInt(6)+1;
		System.out.print("diceAの目は"+diceA+"です");
		new Scanner(System.in).nextLine();
		int diceB = new Random().nextInt(6)+1;
		System.out.print("diceBの目は"+diceB+"です");
		new Scanner(System.in).nextLine();
		int plusDice = diceA + diceB;
		System.out.print("dice+AdiceB="+plusDice+"です");
		new Scanner(System.in).nextLine();
		System.out.print("よって");
		if(plusDice%2==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
	}
}
}

