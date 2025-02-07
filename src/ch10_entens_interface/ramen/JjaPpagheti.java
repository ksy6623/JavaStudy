package ch10_entens_interface.ramen;

public class JjaPpagheti extends Ramen {

	public JjaPpagheti(String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "JjaPpagheti [name=" + name + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 비벼드세요");		
		System.out.println("tip. 스프를 비빌 때는 불을 끄고 하시는 게 맛있음");		
	}

}
