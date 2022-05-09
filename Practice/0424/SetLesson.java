import java.util.*;
public class SetLesson{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);

		Set<Integer>dices=new HashSet<>();
		System.out.print("何回ふる?");
		int count=scan.nextInt();
		for(int i=0; i<count;i++){
			int dice=rand.nextInt(6)+1;
			System.out.println(dice);
			dices.add(dice);
		}
		if(dices.size()==1){
			System.out.println("ぞろ目です");
		}else{
			System.out.println("ぞろ目ではありません");
		}
		scan.close();
	}
}
