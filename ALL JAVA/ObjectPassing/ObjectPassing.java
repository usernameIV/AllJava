package ObjectPassing;

public class ObjectPassing {

	public static void main(String[] args) {
			
		Garage garage =  new Garage();
		
		Car car =  new Car("BMW");
		Car car2 =  new Car("Corvette");
		
		garage.park(car);
		garage.park(car2);
	}

}
