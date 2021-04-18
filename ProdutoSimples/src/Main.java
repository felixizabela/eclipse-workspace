import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		int prod;
		
		Scanner in = new Scanner(System.in);
		
		valor1 = in.nextInt();
		valor2 = in.nextInt();
		
		prod = valor1 * valor2;
		
		System.out.println("PROD = " + prod);

	}

}
