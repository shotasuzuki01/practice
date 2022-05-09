import java.util.*;
public class Judgement{
	public void main(String[] args){
		System.out.print("整数1を入力>>");
		int numberA= new Scanner(System.in).nextInt();
		System.out.print("整数2を入力>>");
		int numberB= new Scanner(System.in).nextInt();
		System.out.print("偶数(0) 奇数(1)を選択>>");
		int choise= new Scanner(System.in).nextInt();

		if(choise==0){
			boolean judgement=isjudgement(numberA,numberB);
			if(true){
				int count=count(numberA,numberB,judgement);
				System.out.printf("%dから%dまでの偶数の合計は%dです。%n",numberA,numberB,count);
			}else{
				int count=count(numberA,numberB,judgement);
				System.out.printf("%dから%dまでの偶数の合計は%dです。%n",numberB,numberA,count);
			}
		}
	}
	public static boolean	isjudgement(int numberA,int numberB){
		if(numberA>numberB){
			return true;
		}else{
			return false;
		}
	}
	public static int count(int numberA , int numberB , boolean isjudgement){
		int sum=0;
		if(isjudgement){
			for(int i=numberB; i<numberA+1;i++){
				if(i%2==0){
					return sum+=i;
				}else{
					continue;
				}
			}
		}else{
			for(int i=numberA; i<numberB+1;i++){
				if(i%2==0){
					return sum+=i;
				}	
			}
			r
		}
	}	
}
