import java.util.*;
public class BollGame{
	public static void main(String[] args){
		int[] unm= new [100];
		for(int i =0; i<unm.length; i++){
			ball[i]=i+1;
		}
		for(int i=0; i<ball.length-1;i++){
			int index=new Random(),nextInt(ball.length-i)+i;
			int temp=ball[index];
			ball[index]=ball[i];
				ball[i]=temp;
		}
		GAMECOUNT=5;
		int[] ballA=new int[GAMECOUNT];
		for(int i=0; ballA.length; i++){
			ballA[i]=num[i];

			int[] ballB=new int[GameCOUNT];
			for(int i=0; ballB.lenght; i++){
				ballB[i]=num[i+GAMECOUNT];
			}
			int aWin=0;
			int bWin=0;

			for(int i=0; i<GAMECOUNT; i++){
				System.out.print(i+1+"回戦");
				if(aWin>bWin){
					aWin++;
				}else{
					bWin++;
				}
				System.out.print("A:"+ballA[i]+","+"B"+ballB[i]+"...");
				System.out.print(ballA[i]>ballB[i]?"Aの勝ち":"Bの勝ち");

		}
		System.out.printf("%d対%dで,aWin,BWin);
		System.out.printf(awin>bWin?"Aの勝ち,Bの勝ち");


	}
}
