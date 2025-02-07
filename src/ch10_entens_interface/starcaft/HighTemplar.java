package ch10_entens_interface.starcaft;

public class HighTemplar extends StarUnit {
	
	private int shueld;
	private int mp;
	
	public HighTemplar() {
		this("하이템플러", 0, 60, 0, 50, 150);
	}
	
	public HighTemplar(String name, int damage, int hp, int armor, int shueld, int mp) {
		super(name, damage, hp, armor);
		this.shueld = shueld;
		this.mp = mp;
	}
	public void tthunderStorm() {
		mp -=75;
		System.out.println("우르르 쾅쾅");
	}
	//setter getter, toString

	public int getShueld() {
		return shueld;
	}

	public void setShueld(int shueld) {
		this.shueld = shueld;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
}
