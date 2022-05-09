public class Continue{
	public static void main(String[] args){
		System.out.println("開始");
		for(int i =0; i<10; i++){
			if(i%2!=0){
				continue;
			}else{
				System.out.println(i+"は偶数です");
			}
		}
		System.out.println("終了");
	}
}


