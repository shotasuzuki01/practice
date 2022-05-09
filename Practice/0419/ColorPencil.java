public class ColorPencil{
	String color;
	int langth;
	static total=0;
	public ColorPencil(String color,int langth){
		this.color=color;
		this.langth=langth;
		this.showstatus();
	}
	void showstatus(){
		System.out.println(this.color+":");
		for(int i=0;i<this.langth;i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
	void draw(){
		System.out.printf("%sで描いた%n",this.color);
		this.langth--;
		this.total++;
		this.showStatus();
	}
	static int getTotal(){
		return total;
	}
}
