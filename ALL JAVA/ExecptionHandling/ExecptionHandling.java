package ExecptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecptionHandling {

	public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	
	boolean pica = false;
	while (!pica) {		
		try {	
			System.out.println("Insert a whole number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Insert a whole number to divide by: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("Result: " + z);
			pica = false;
		}
			catch(ArithmeticException e) {
				System.out.println("You can't divide by zero, DUMBASS!");
			}
			catch(InputMismatchException e) {
				System.out.println("Enter a number, bastard");
			}
			catch(Exception e) {
				System.out.println("Something went wrong ");
			}
			finally{
				scanner.close();
			}
		
	
		}
	
	}

}
