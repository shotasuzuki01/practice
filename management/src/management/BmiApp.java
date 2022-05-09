package management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BmiApp {
	static final Date today=new Date();
	static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
	static final String date=sdf.format(today);
	static final String File="bmi.csv";
	static final Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws IOException {

		String name=" ";
		String[] B=readFile(File);

		System.out.println("肉体管理アプリ");
		if(B==null) {
			System.out.print("名前を入力してください>>");
			name=scan.next();
			System.out.println("肉体管理アプリです！頑張って継続しましょう！");
			System.out.println(date);
		}else {
			System.out.println(date);
		}
		System.out.print("体重を入力してください>>");
		double weight=scan.nextInt();
		System.out.print("身長を入力してください>>");
		double height=scan.nextInt();
		double r=calc(weight,height);//BMI計算
		System.out.printf("今日のBMIは%.1fでした。%n",r);//Bmi
		StandardAdvisor standard=new StandardAdvisor(name,r);
		standard.message(r) ;
		//decision(r);//肥満度判定

		while(true) {
			System.out.println("***************メニューを選択してください***************");
			System.out.println("|0 : 適正体重を表示| |1 : 前回のBMIを表示| |2 : 前回までのBMI推移表を表示| |3 : カロリー計算| |4 : 情報| |5 : アプリを 終了します|");
			int choice=scan.nextInt();
			switch(choice) {
			case 0 :
				double r2=calcB(height);//適正体重計算
				double r3=difference(weight,r2);//適正体重との差計算
				line();
				System.out.printf("適正体重は%.1fKgです。%n",r2);//適正体重
				System.out.printf("適正体重と体重の差は%.1fKgです。%n",r3);//適正体重との差
				line();
				break;
			case 1 :
				//double lastBmi=Double.parseDouble(B[2]);
				if(B!=null) {
					double firstBmi=Double.parseDouble(B[B.length-2]);//前回のBMI
					double r4=r-firstBmi;//前回と今回のBMI値の差の計算
					line();
					System.out.printf("前回のBMIは%.1fです。%n",firstBmi);//前回のBMI表示
					System.out.printf("前回のBMIと今回のBMIとの差は%.1fです。%n",r4);//前回と今回のBMI値の差
					line();
				}else {
					line();
					System.out.println("今回が初めての計測です。");
					line();
				}
				break;
			case 2 :
				line();
				System.out.println("~前回までのBMI推移表~");
				if(B!=null) {
					graph(File,r,B);//BMI推移グラフ表示
					line();
				}else {
					line();
					System.out.println("今回が初めての計測です。");
					System.out.println("比較する値がありません。");
					line();
				}
				break;
			case 3:
				calorieCalc ();
				break;
			case 4:
				info();
				break;
			default :
				line();
				System.out.println("**********アプリを終了します**********");
				line();
				return;
			}
			LastBmi bmi=new LastBmi(r,date);
			bmi.toString();//BMIクラス
			writerBmi(File,bmi);//保存
		}
	}
	//info---------------------------------------------------------------
	public static void info() {
				line();
		System.out.println("~BMIとは~");
		System.out.println("BMI（Body Mass Index）はボディマス指数と呼ばれ、体重と身長から算出される肥満度を表す体格指数です。");
				line();
		System.out.println("~適正体重~");
		System.out.println("日本肥満学会では、BMIが22を適正体重（標準体重）とし、統計的に最も病気になりにくい体重とされています。25以上を肥満、18.5未満を低体重と分類しています。");
				line();
		System.out.println("~計算式~");
		System.out.println("・BMI=体重Kg/((身長)*(身長))");
		System.out.println("・適正体重=((身長)*(身長))*22");
				line();
		System.out.println("~メタボとの関係~");
		System.out.println("BMIと内臓脂肪は必ずしも相関しないため、メタボの診断基準には盛りこまれていませんが、メタボ予備軍を拾い上げるために特定健診・特定保健指導の基準には採用されています。");
				line();
	}
	//BMI計算---------------------------------------------------------------
	public static double calc(double weightKg,double heightCm) {
		double resultA=weightKg/((heightCm*0.01)*(heightCm*0.01));
		return resultA;
	}
	//適正体重計算---------------------------------------------------------------
	public static double calcB(double heightCm) {
		double resultB=((heightCm*0.01)*(heightCm*0.01))*22;
		return resultB;
	}
	//表描画---------------------------------------------------------------
	public static void graph(String File,double bmi, String[] dayData) throws IOException {
		String[] c=readFile(File);
		for(int i=0;i<c.length;i++) {
			String line=c[i];
			if(i%2!=0) {
				System.out.println(line);
			}else {
				double a=Double.parseDouble(line);
				System.out.printf("%.1f |",a);
			}
		}
	}
	//肥満度判定---------------------------------------------------------------
	public static void decision(double bmi) {
		if(bmi<18.5) {
			System.out.println("低体重です。");
		}else if(bmi>18.5&&bmi<25) {
			System.out.println("普通の体重です。");
		}else if(bmi>25&&bmi<30) {
			System.out.println("肥満(1度)です。");
		}else if(bmi>30&&bmi<35) {
			System.out.println("肥満(2度)です。");
		}else if(bmi>35&&bmi<40) {
			System.out.println("肥満(3度)です。");
		}else {
			System.out.println("肥満(4度)です。");
		}
	}
	//ロード------------------------------------------------------------------
	public static String[] readFile(String file) throws IOException{
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr= new InputStreamReader(fis,"UTF-8");
		BufferedReader br=new BufferedReader(isr);

		String line=br.readLine();
		String[] data =null;
		if(line != null && !line.equals("")) {
			data=line.split(",");
		}
		br.close();
		return data;
	}
	//セーブ------------------------------------------------------------------
	public static void writerBmi(String name,LastBmi bmi) throws IOException {
		BufferedWriter bw=null;
		FileOutputStream fos= new FileOutputStream(name,true);
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		bw=new BufferedWriter(osw);
		bw.append(bmi.toString());
		bw.flush();
		bw.close();
	}
	//差分計算---------------------------------------------------------------
	public static double difference(double weight,double standardWeight) {
			double result=standardWeight-weight;
			return result;
	}
	//カロリー計算---------------------------------------------------------------
	public static void calorieCalc () {
			line();
		System.out.println("本日食べた料理とそのカロリーを入力してください");
		System.out.print("本日は何品食べましたか?>>");
		int number=scan.nextInt();
		Map<String,Integer>food=new LinkedHashMap<>();
		double sums=0;
		for(int i=0; i<number;i++) {
			System.out.print((i+１)+"品目の料理を入力してください>>");
			String eat=scan.next();
			System.out.print((i+１)+"品目のカロリーを入力してください>>");
			int calorie=scan.nextInt();
			food.put(eat,calorie);
			sums=sums+calorie;
		}
		for(Map.Entry<String,Integer> entry : food.entrySet()) {
			System.out.println(entry.getKey()+"："+entry.getValue()+"kcal");
		}
			System.out.println("本日食べた料理の総カロリー値は"+sums+"Kcalです");
			line();
	}
	//System.out.println("本日食べた料理"+(food.keySet()));
	//System.out.println("本日食べた料理のカロリー"+(food.values()));
	//ライン---------------------------------------------------------------
	public static void line() {
		for(int i=0;i<40;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
//アドバイザークラス---------------------------------------------------------------
abstract class Advisor{
			String name;
			double bmi;
			Advisor(String name,double bmi){
				this.name=name;
				this.bmi=bmi;
			}
			public abstract void introduction(String name);
			public abstract void message(double bmi);
			}
class StandardAdvisor extends Advisor{
	StandardAdvisor(String name, double bmi) {
		super(name, bmi);
	}
	@Override
	public void introduction(String name) {
		System.out.printf("こんにちは%sです！",this.name);
	}
	@Override
	public void message(double bmi) {
		if(bmi<18.5) {
			System.out.println("あなたは低体重です。もっとご飯を食べないといけません。");
		}else if(bmi>18.5&&bmi<25) {
			System.out.println("素晴らしい！！理想的な数値です！！この数値を維持しましょう！");
		}else if(bmi>25&&bmi<30) {
			System.out.println("あなたは肥満(1度)です。理想的な数値まであと少し！一緒に頑張りましょう");
		}else if(bmi>30&&bmi<35) {
			System.out.println("あなたは肥満(2度)です。すこし太りすぎですね。");
		}else if(bmi>35&&bmi<40) {
			System.out.println("あなたは肥満(3度)です！！！。 太り過ぎです！");
		}else {
			System.out.println("あなたは肥満(4度)です！！！！！。かなり太っていますね。");
		}
	}
}
class SpartaAdvisor extends Advisor{
	SpartaAdvisor(String name, double bmi) {
		super(name, bmi);
	}
	@Override
	public void introduction(String name) {
		System.out.printf("こんにちは%sです！",this.name);
	}
	@Override
	public void message(double bmi) {
		if(bmi<18.5) {
			System.out.println("あなたは低体重です。もっとご飯をなさい！！");
		}else if(bmi>18.5&&bmi<25) {
			System.out.println("理想的な数値です！！。");
		}else if(bmi>25&&bmi<30) {
			System.out.println("あなたは肥満(1度)です。太っていますよ！食事のカロリー計算をしてください!"+ "");
		}else if(bmi>30&&bmi<35) {
			System.out.println("あなたは肥満(2度)です。太りすぎです");
		}else if(bmi>35&&bmi<40) {
			System.out.println("あなたは肥満(3度)です！！！。かなり 太り過ぎです！");
		}else {
			System.out.println("あなたは肥満(4度)です！！！！！。かなり太っていますね。");
		}
	}
}
//BMIクラス---------------------------------------------------------------
class LastBmi{
	double bmi;
	String date;
	public LastBmi(double bmi,String date) {
		this.bmi=bmi;
		this.date=date;
	}
	public String toString() {
		return this.bmi+","+this.date+",";
	}
}