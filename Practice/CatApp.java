import java.util.*;
public class CatApp{
	public static void main(String[] args){
	}
}
abstract class Cat{
	int lifeSpan;
	int size;
Cat(int lifeSpan,int size){
	this.lifeSpan=lifeSpan;
	this.size=size;
}
abstract void display();
}
abstract class outCat{
	display(int lifeSpan,int size){
		super(lifeSpan,size);
	}
}


