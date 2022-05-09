import java.util.*;
public class Code4_4{
	public static void main(String[] args){
		System.out.println("あっち向いてホイをしましょう");
		int point = 0;
		while(true){
		System.out.println("あっち向いてホイ!(上:0・下:1・右:2・左:3)>>");
		int you = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(4);
		System.out.print("pc:"+pc);
		if(pc == you){
			System.out.println("アウト");
				break;
		}
		point++;
		System.out.println("セーフ"+point+"ポイント");
		}
		System.out.println(point+"ポイントでした");
	}
}

