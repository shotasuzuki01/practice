import java.util.*;
public class ArrayTest513{
	public static void main(String[] args){
		int[][] array=new int[3][3];
		arrayOutput(array);
	}
	public static void arrayOutput(int[][] array){
		for(int i=0; i<array.length;i++){
			Random ram=new Random();
			for(int j=0; j<array[i].length;j++){
				array[i][j]=ram.nextInt(10);
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		int max=array[0][0];
		int min=array[0][0];
		if(max<array[i][j]){
			max=array[i][j];
		}else{
			break;
		}
		if(min>array){
			min=array[i][j];
		}else{
			break;
		}

	}
}
