package exerciseQ5;
import java.util.ArrayList;

public class Cartest {

	public static void main(String[] args) {
		
		ArrayList<Car> carList= new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avantee());
		carList.add(new Genesis());
		for(Car car: carList)
		{	car.run();
			System.out.println("=====================");
		}
		

	}	

}
