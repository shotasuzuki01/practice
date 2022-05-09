import java.util.*;
public class MuscleApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("君のアドバイザーを決めよう");
		System.out.print("アドバイザーの名目を入力してね>>");
		String name=scan.nextLine();

		SkinnyMan man=new SkinnyMan(name);
		man.introducyion();

		System.out.println("君の体重(kg)と身長(cm)を入力してね");
		System.out.print("体重(kg)>>");
		double weight=scan.nextInt();
		System.out.print("身長(cm)>>");
		double height=scan.nextInt();

		double calc=weight/((height/100)*(height/100));
		if(calc<16){
			TooSkinnyMan tm=new TooSkinnyMan(name);
			tm.dialogue();
		}else if(calc<17){
			SkinnyMan sm=new SkinnyMan(name);
			sm.dialogue();
		}else if(calc<19){
			LittleSkinnyMan lm=new LittleSkinnyMan(name);
			lm.dialogue();
		}else if(calc<25){
			StandardMan stm=new StandardMan(name);
			stm.dialogue();
	}
	/*double bmiCalc(double weightKg,double heightCm){
		double bmi=weightKg/(heightCm/100)*2;
		return bmi;
		}*/

}
abstract class Man{
	String name;
	Man(String name){
		this.name=name;
	}
	void introducyion(){
		System.out.printf("こんにちは僕は%sだ!%n",this.name);
	}
	void dialogue(){
	}
}
class TooSkinnyMan extends Man{//16未満//痩せすぎ
	TooSkinnyMan(String name){
		super(name);
	}
	@Override
	void dialogue(){
		System.out.println("君は痩せすぎだよ。MBI値が標準になるように一緒にがんばろう！");
		System.out.println("Ψ(*¯ч¯*)''ﾓｸﾞﾓｸﾞ(๑´ސު｀) もぐもぐ(　* °~°)”ﾑｼｬﾓｸﾞ");
	}
}
class SkinnyMan extends Man{//16~16.99痩せ
	SkinnyMan(String name){
		super(name);
	}
	@Override
	void dialogue(){
		System.out.println("君は痩せているよ。ごはんをもっと食べよう！！");
		System.out.println("Ψ(*¯ч¯*)''ﾓｸﾞﾓｸﾞ(๑´ސު｀) もぐもぐ(　* °~°)”ﾑｼｬﾓｸﾞ");
	}
}
class LittleSkinnyMan extends Man{//17~18.49痩せぎみ
	LittleSkinnyMan(String name){
		super(name);
	}
	@Override
	void dialogue(){
		System.out.println("君は痩せ気味だよ。");
		System.out.println("Ψ(*¯ч¯*)''ﾓｸﾞﾓｸﾞ(๑´ސު｀) もぐもぐ(　* °~°)”ﾑｼｬﾓｸﾞ");
	}
}
class StandardMan extends Man{//18.50~24.99
	StandardMan(String name){
		super(name);
	}
	@Override
	void dialogue(){
		System.out.println("君は標準体重だよ!");
		System.out.println("(><)b");
	}
}
class LittleObesityMan extends Man{//25.00~29.00
	LittleObesityMan(String name){
		super(name);
	}
	@Override
	void dialogue(){
		System.out.println("君は少し肥満だよ!!");
		System.out.println("一緒に運動しよう!!0(｀・ω・´)=〇");
	}
}
class ObesityFirstMan extends Man{//30.00~34.99
	ObesityFirstMan(String name){
		super(name);
	}
	@Override
	void dialogue(){//
		System.out.println("君は肥満(1度)だよ!!");
		System.out.println("まずは毎日15分のWakingから始めよう!o～((((～´∀`)～ﾌﾗﾌﾗ～");
	}
}

