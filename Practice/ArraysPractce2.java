import java.util.*;
public class ArraysPractce2{
	public static void main(String[] args){
	
		System.out.print("クラスの数>>");
		int rooms=new Scanner(System.in).nextInt();
		int[][] nums=new int[rooms][];

		for(int i=0; i<nums.length;i++){
				System.out.print((i+1)+"組のクラスの人数");
				int number =new Scanner(System.in).nextInt();
				nums[i]=new int[number];
			for(int j=0; j<nums[i].length;j++){
				System.out.print((i+1)+"組"+(j+1)+"人目の点数>>");
				nums[i][j] =new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
			for(int i=0;i<nums.length;i++){
				System.out.printf("%d組",i+1);
				for(int j=0; j<nums[i].length;j++){
					System.out.printf("%3d ",nums[i][j]);
				}
				System.out.println();
			}
	}
}

