package ch10_entens_interface.starcaft;

public class Zealot extends StarUnit {

	private int shield; // 질럿은 보호막이 있음
	
	public Zealot() {
		// Zelaot( name,  damage,  hp,  armor,  shield) 호출 
		// new Zealot()으로 인스턴스 생성시 디폴드 값으로 생성
		this("질럿", 16, 100, 1, 60);
	}
	public Zealot(String name, int damage, int hp, int armor, int shield) {
		super(name, damage, hp, armor);
		this.shield = shield;
	}
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	@Override
	public String toString() {
		return "Zealot [shield=" + shield + ", getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()="
				+ getHp() + ", getArmor()=" + getArmor() + "]";
	}
	
}
