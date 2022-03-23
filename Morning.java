import java.util.*;
public class Morning{
	public static void main(String[] args){
		System.out.print("好きな数字を選んでください");
		int number = new Scanner(System.in).nextInt();
		int plusNm = new Random().nextInt(10)+1;
		int answer = number + plusNm;

		if(answer%2==0){
			System.out.println("目玉焼きとトースト");
		}else{
			System.out.println("シリアルとヨーグルト");
		}

	}
}

