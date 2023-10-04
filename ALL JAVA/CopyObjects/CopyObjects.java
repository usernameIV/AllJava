package CopyObjects;

public class CopyObjects {

	public static void main(String[] args) {

		Car car = new Car("Chevrolet", "Camaro", 2021);
		//Car car2 = new Car("Ford", "Mustang", 2022);
		
		//car2.copy(car);
		
		Car car2 = new Car(car);
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
	}

}
