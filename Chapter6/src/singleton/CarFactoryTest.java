package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstacne();
		Car mysonata=factory.createCar();
		Car yoursonata=factory.createCar();
		System.out.println(mysonata.getcarNum());
		System.out.println(yoursonata.getcarNum());
	

	}

}
