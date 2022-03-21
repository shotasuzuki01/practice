import java.util.*;
public class Area{
	public static void main(String[] args){
		System.out.println("円の半径(cm)を入力");
		double pi = new Scanner(System.in).nextInt();
		double b = (Math.pow(pi,2));
				System.out.println("円の面積は"+(b*3.14)+"㎠です");
	}
}

