import java.util.*;
public class ArraysPractice1{
	public static void main(String[] args){
		char[] ground={'森','草','岩','水'};
		System.out.print("幅>>");
		int width=new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height=new Scanner(System.in).nextInt();

		char[][] map=new char[height][width];
		for(int i=0; i<map.length;i++){
			for(int j=0; j<map[i].length;j++){
				int index=new Random().nextInt(ground.length);
				map[i][j]=ground[index];
				System.out.print(map[i][j]);

			}
			System.out.println();
		}
	}
}

