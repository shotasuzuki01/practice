import java.util.*;
public class HighLow{
	public static void main(String[] args){
		int number = new Random().nextInt(13)+1;
		System.out.println("現在の数字は"+number+"です");
		new Scanner(System.in).nextLine();
		System.out.println("high or low");
		System.out.println("highかlowを選択してください");
		String choice = new Scanner(System.in).nextLine();
		int mynumber = new Random().nextInt(13)+1;
		System.out.println("あなたの数字は"+mynumber+"です");
		new Scanner(System.in).nextLine();
		if(number>mynumber){
			if(choice.equals ("high")){
			System.out.println("あなたのまけです");
			}
			else{
				System.out.println("あなたのまけです");
			}
			else if(number<mynumber){
			if(choice.equals ("high")){
			System.out.println("あなたのかちです");
			}
			}
			else{
			System.out.println("あなたのまけです");
			}
		}	
		else{
			Systm.out.println("同点です");
		}
	}
}

