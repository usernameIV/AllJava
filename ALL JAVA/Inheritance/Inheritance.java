package Inheritance;

public class Inheritance {

	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bike = new Bicycle();
		
		car.go();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println("Your car has "+car.doors+ " doors");
		System.out.println("Your bike has "+bike.pedals+ " pedals");
	}

}
