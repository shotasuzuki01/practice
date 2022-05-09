import java.util.*;
public class MethodTest{
	public static void main(String[] args){
		System.out.print("消費税は何%ですか>>");
		int answer= new Scanner(System.in).nextInt();
		int sum=0;
		int input=0;
		do{
			System.out.print("価格を入力(0でお会計)>");
			 input= new Scanner(System.in).nextInt();
			sum=sum+input;
		}while(input!=0);
		double calc=price(sum,answer);
		System.out.printf("お買い物合計金額は%.1f円(税込み)です",calc);
	}
	public static double price(double sum , double taxRate ){
		double pricTx=sum+(sum*(taxRate*0.01));	
		return pricTx;
	}
}
