import java.util.*;
public class Array2{
	public static void main(String[] args){
		int[][] array= new int[3][4];
		arraySet(array);
	}
	public static void arraySet(int[][] array){
		for(int i=0;i<3;i++){
			for(int j=0; j<4;j++){
				array[i][j]=i+j;
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
