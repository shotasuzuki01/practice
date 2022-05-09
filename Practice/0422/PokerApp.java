import java.util.*;
public class PokerApp{
	public static void main(String[] args){
		String[] marks=new String[4];
		int[] numbers=new int[52];
		int count=0;
		for(int i=0; i<4;i++){
			if(count==0){
				marks[0]="♠";
			}else if(count==1){
				marks[1]="♦";
			}else if(count==2){
				marks[2]="☘";
			}else if(count==3){
				marks[3]="♥";
			}
			count++;
		}
		for(int i=0;i<13;i++){
			numbers[i]=i+1;
		}
		for(int i=0;i<4;i++){
			System.out.print(marks[i]+":");
			for(int j=0;j<13;j++){
				System.out.print(numbers[j]);
			}
			System.out.println();
		}
	}
}


