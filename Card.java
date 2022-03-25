import java.util.*;
public class Card{
	public static void main(String[] args){
		
		int card = new Random().nextInt(13)+1;
		System.out.println("1枚目のカードは"+card+"です");
		int secondCard = new Random().nextInt(13)+1;
		System.out.println("さて次のカードより(High or Low)");
		String answer = new Scanner(System.in).nextLine();
		System.out.println(secondCard);
		if(answer.equalsIgnoreCase("High") && card<secondCard || answer.equalsIgnoreCase("lose") && card>secondCard){
			System.out.println("You Win");
		}else{
			System.out.println("You Lose...");
		}
	}
}


