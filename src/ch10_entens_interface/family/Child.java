package ch10_entens_interface.family;

//child는 parent를 상속받음 (extends) child < 예약어 뒤에 부모를 상속받겠다
public class Child extends Parent{

	public Child() {
		super();
	}

	public Child(String name, int age) {
		super(name, age); // 부모 생성자 호출
	}

	@Override
	public void sayHello() {
		System.out.println("자식 입니다.!!!");
	}

	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
