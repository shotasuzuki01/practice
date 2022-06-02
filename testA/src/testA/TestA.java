package testA;
public class TestA {
	public static void main(String[] args) {

	}
}
public class Wand{
	private String name;
	private double power;
	public void setName(String name) {
		this.name=name;
	}
	public void setPower(double power) {
		this.power=power;
	}
	public String getName() {
		return name;
	}
	public double power() {
		return power;
	}
}
public class Wizard{
	private int hp;
	private int mp;
	private Wand wand;
	public void setName(int hp)	{
		this.hp=hp;
	}
	public void setMp(int mp) {
		this.mp=mp;
	}
	public int getHp() {
		return hp;
	}
	public int mp() {
		return mp;
	}
	Wand wand;
	void heal(Hero h) {
		int basePoint=10;
		int recovPoint=(int)(basePoint*this.wand.power);
		h.setHp(h.getHp()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した");
	}
}