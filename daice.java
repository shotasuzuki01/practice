import java.util.*;
public class Daice{
	public static void main(String[] args){
		int[] dice=new int[10];
		for(int i=0; i<dice.length; i++){
			int ran = new Random().nextInt(6)+1;
			dice[i]=ran;
		}
			System.out.println(Arrays.toString(dice));
	}
}


