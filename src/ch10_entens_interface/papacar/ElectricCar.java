package ch10_entens_interface.papacar;

public class ElectricCar implements Vehucle {

	@Override
	public void start() {
		System.out.println("쓔우웅 ~~");
	}

	@Override
	public void stop() {
		System.out.println(" --- ");
	}

}
