import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n = 3.14159;
		double area;
		double raio;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o raio:");
		
		raio = in.nextDouble();
		
		area = n * (raio * raio);
		
		System.out.println("A=" + String.format("%.4f", area));
	}	
	
}
