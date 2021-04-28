import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	double A;
	double B;
	double MEDIA;
	
	A = leitor.nextDouble();
	B = leitor.nextDouble();
	
	MEDIA = ((A*3.5) + (B*7.5))/11;
    System.out.printf("MEDIA = %.5f\n",MEDIA);
	}
	
	}


