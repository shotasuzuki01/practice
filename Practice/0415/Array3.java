import java.util.*;
public class Array3{
	public static void main(String[] args){
		int[][] number={
			{0,1},
			{2},
			{3,4,5,6},
		};
		for(int i=0;i<number.length;i++){
			for(int j=0;j<number[i].length;j++){
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
	}
}
