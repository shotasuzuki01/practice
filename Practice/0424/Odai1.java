import java.util.*;
public class Odai1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Random ram=new Random();
		System.out.println("行数>>");
		int number=scan.nextInt();
		char[] alpa={'A','B','j','C','D','E'};
		for(int i=0;i<number;i++){
			System.out.printf("%d:",i+1);
			int count=ram.nextInt(10)+1;
			for(int j=0;j<count;j++){
				int idx=ram.nextInt(alpa.length);
				System.out.print(alpa[idx]);
			}
			System.out.println();
		}
	}
}
