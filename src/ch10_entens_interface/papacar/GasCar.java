package ch10_entens_interface.papacar;

public class GasCar implements Vehucle {

	@Override
	public void start() {
		System.out.println("부릉 부르릉~");
	}

	@Override
	public void stop() {
		System.out.println("..탈 탈..탈");
	}

}
