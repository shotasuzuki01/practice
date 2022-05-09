import java.util.*;
public class Monster{
	public static void main(String[] args){
		System.out.println("モンスターが現れた");
		int hp = new Random().nextInt(100)+100;
		int attack =new Random().nextInt(100)+100;

		for(int i =hp ; i<=0 ; i++){
			System.out.println(attack+"ダメージをあたえた");
		}
		System.out.println("モンスターをたおした");
	}
}

