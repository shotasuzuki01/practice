import java.util.*;
public class Hiragatna{
	public static void main(String[] args){
		String [] menus = {"パーティー","アイテム","クエスト"};
		String [] heros = {"リバァイ","ゆうた","†クラウド†","わし(53)"};
		String [] items = {"やくそう","どくけし","らすとえりくさー","しろいこな","メガトンコイン"};
		String [] quests = {"迷子の猫を探して！","隣町までお使い","ちょっと魔王倒してこい","わがまま王女のお願い","古の秘宝"};
		bulletA(menus);
		int Num2 = selectNum(3);
		if(Num2==1){
		bulletB(heros);
		}else if(Num2==2){
			System.out.print("aaa");
		}else{
			System.out.print("eee");
		}
	}
	public static String[] bulletA(String menus[]){
		System.out.println("-------------");
		for(int i=0;i<menus.length;i++){
			System.out.print((i+1)+":"+menus[i]);
			System.out.println();
		}
		System.out.println("-------------");
		return menus;
	}

	public static int selectNum(int number){
		System.out.print("1~3の整数を入力>>");
		int answer = new Scanner(System.in).nextInt();
		return answer;
	}
	public static String[] bulletB(String heros[]){
		System.out.println("-------------");
		for(int i=0;i<heros.length;i++){
			System.out.print((i+1)+":"+heros[i]);
			System.out.println();
		}
		System.out.println("-------------");
		return heros;
	}
}

