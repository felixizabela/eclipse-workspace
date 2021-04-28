import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double MEDIA;
		
		A = leitor.nextDouble();
		B = leitor.nextDouble();
		C = leitor.nextDouble();
	    
		MEDIA = A * 0.2 + B * 0.3 + C * 0.5;
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		
		

	}

}
