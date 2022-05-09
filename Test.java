import java.util.*;
public class ShotaMain{
	public static void main(String[] arts){
		int[] lottery = new int[101];
		for(int i =0; i<lottery.length;i++){
			lottery[i] =i;
		}
		for(int i =0; i<lottery.length;i++){
			int index = new Random().nextInt(lottery.length-i)+i;
			int tmp = lottery[index];
			lottery[index]=lottery[i];
			lottery[i]=tmp;
		}
		System.out.print("何枚>>");
		int ans = new Scanner(System.in).nextInt();
		int[] mylottery= new int[ans];
		for(int i=0;i<mylottery.length;i++){
			mylottery[i]=lottery[i];
		}
		System.out.println(Arrays.toString(mylottery));

		int ran = new Random().nextInt(101);
		System.out.println("当選番号");

		boolean isWin=false;
		for(int i=0; i<mylottery.length;i++){
			if(mylottery[i] == ran){
				isWin=true;
			}
		}
		System.out.println(isWin?"あたり":"はずれ");
	}
}


