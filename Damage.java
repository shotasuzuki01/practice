import java.util.*;
public class Damage{
	public static void main(String[] args){
		/*
		 *Hp(1~3)のモンスター1体が出現
		 *あなたは(1~3)ダメージの攻撃を1回行う
		 *モンスターを倒した
		 *モンスターを倒せなかった
		 */
		int monster = new Random().nextInt(3)+1;
		int damage = new Random().nextInt(3)+1;
		System.out.println("HP"+monster+"のモンスターが現れた");
			new Scanner(System.in).nextLine();
		System.out.println("あなたの攻撃！モンスターに"+damage+"のダメージを与えた");
		new Scanner(System.in).nextLine();

		if(monster == 1){
			if(damage == 1){
			System.out.println("モンスターをたおした");
		}	
		}else if(damage == 2){
			System.out.println("たおした");
		}
		else{
			System.out.println("たおした");
		}
		else if(monster == 2){
			if(damage == 1){
				System.out.println("モンスターを倒せなかった");
			}
		}else if(damage == 2){
			System.out.println("モンスターをたおした");
		}else{
			System.out.println("モンスターをたおした");
		}
		else{
			if(damage == 1){
				System.out.println("モンスターを倒せなかった");
			}
		}else if(damage == 2) {
			System.out.println("モンスターを倒せなかった");
		}else{
			System.out.println("モンスターをたおした");
		}
	
		}
	}
