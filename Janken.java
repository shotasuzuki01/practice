import java.util.*;
public class Janken{
	public static void main(String[] args){
		System.out.println("あなたの手を入力してください");
		int myHand = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(3);
		
		if(myHand==0){
			if(pc==0){
				System.out.println("あいこです");
			}else if(pc==1){
				System.out.println("まけです");
			}else{
				System.out.println("かちです");
			}
		}
		else if(myHand==1){
			if(pc==0){
				System.out.println("かちです");
			}else if(pc==1){
				System.out.println("あいこです");
			}else{
				System.out.println("まけです");
			}

			}else{
			if(pc==0){
				System.out.println("まけです");
			}else if(pc==1){
				System.out.println("かちです");
			}
			else{
				System.out.println("あいこです");
			}
	}
}
}
