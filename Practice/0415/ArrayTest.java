import java.util.*;
public class ArrayTest{
	public static void main(String[] args){
		int[] array=new int[7];
		Random rmd=new Random();
		for(int i=0; i<array.length;i++){
			array[i]= rmd.nextInt(7)+1;
			System.out.print(array[i]+" ");
		}
	}
}
