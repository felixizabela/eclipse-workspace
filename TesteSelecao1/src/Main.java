import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String entrada;
		int A, B, C, D;
		
		Scanner in = new Scanner(System.in);
		
		entrada = in.nextLine();
		
		A = Integer.parseInt(entrada.split(" ")[0]);
		B = Integer.parseInt(entrada.split(" ")[1]);
		C = Integer.parseInt(entrada.split(" ")[2]);
		D = Integer.parseInt(entrada.split(" ")[3]);
		
		if (B > C &&
		    D > A &&
			C + D > A + B &&
			C > 0 &&
			D > 0 &&
			A % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		

	}

}
