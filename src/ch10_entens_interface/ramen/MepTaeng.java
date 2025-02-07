package ch10_entens_interface.ramen;

public class MepTaeng extends Ramen {

	public MepTaeng(String name, int price) {
		super(name, price);
	}

	@Override
	public String toString() {
		return "MepTaeng [name=" + name + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고 4분후에 드세요");
		System.out.println("trp. 물은 550ml (한강라면 스타일은 430ml)");
	}
}
