import java.util.*;
public class StringMethod{
	public static void main(String[] args){
		final char[] BLOCKS=
		{'森','草','岩','水'};
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height = new Scanner(System.in).nextInt();
		char[][]map=new char[height][width];
		System.
	}
	public static int array(int map){
		for(int i=0; i<map.length;i++){
			for(int j=0; j<map[i].length;j++){
				int idx=new Random().nextInt(BLOCKS.length);
				map[i][j]=BLOCKS[idx];
			}
			System.out.println();
		}
		return map;
	}
}
