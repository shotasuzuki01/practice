import java.util.*;
public class Tennis{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("名前を入力してください>>");
		String name= scan.nextLine();
		System.out.print("パラメーターはパワー、テクニック、プレッシャーの3つです");
		System.out.print("能力の合計が10になるように数値を振り分けてください。");
		System.out.print("パワー>>");
		int power= scan.nextInt();
		System.out.print("テクニック>>");
		int technique= scan.nextInt();
		System.out.print("プレッシャー>>");
		int pressure= scan.nextInt();
		Player player=new Player(name,power,technique,pressure);//player作成

		while(true){

		}
	}
}
class Player{
	String name;
	int power;
	int technique;
	int pressure;
	Player(String name,int power,int technique,int pressure){
		this.name=name;
		this.power=power;
		this.technique=technique;
		this.pressure=pressure;
		System.out.printf("%s選手の登場です",name);
	}
	void shot(){
		System.out.printf("%sのショット",this.name);
	}
	int pow(int power){
		if(power>5){
			System.out.println("uoooooooo!!");
			return;
		}
	}
	Random ram=new Random();
	int tec(int technique,int pressure){
		if((technique>5) && (pressure>5)){
			int tecMiss = ram.nextInt(10)+50;
			int preMiss = ram.nextInt(10)+50; 
				int miss=tecMiss+preMiss;
			return miss;
		}else if((technique>4)||(presssure>4)){
			int tecMiss = ram.nextInt(20)+60;
			int preMiss = ram.nextInt(20)+60; 
				int miss=tecMiss+preMiss;
			return miss;
		}else if((technique>3)||(presssure>3)){
			int tecMiss = ram.nextInt(30)+60;
			int preMiss = ram.nextInt(30)+60; 
				int miss=tecMiss+preMiss;
			return miss;
		}else{
			int tecMiss = ram.nextInt(40)+80;
			int preMiss = ram.nextInt(40)+80; 
				int miss=tecMiss+preMiss;
			return miss;
		}
	}
	void miss(){
		if(this.miss<=98){
			System.out.printf("%sが打ったボールは直接フェンスに激突した！",this.name);
		}
		else if(this miss<=95){
			System.out.println("足がもつれてボールにとどかなかった・・・");
		}else if(this miss<=90){
			System.out.println("ボールがネットに当たった・・・");
	}
}
