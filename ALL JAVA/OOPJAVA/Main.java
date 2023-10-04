package OOPJAVA;

public class Main {

	public static void main(String[] args) {
		
	//[OOP IN JAVA]

	car meuCarro = new car();
	car outroCarro = new car();
	
	System.out.println(meuCarro.make);
	System.out.println(meuCarro.model);
	System.out.println();
	System.out.println(outroCarro.make);
	System.out.println(outroCarro.model);

	meuCarro.drive();
	meuCarro.brake();
		


		
		
	}

}
