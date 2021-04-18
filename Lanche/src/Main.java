import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String entrada;
		int codigo;
		int quantidade;
		double valorPagar;
		
		Scanner in = new Scanner(System.in);
		
		entrada = in.nextLine();
		
		codigo = Integer.parseInt(entrada.split(" ")[0]);
		quantidade = Integer.parseInt(entrada.split(" ")[1]);
		
		if (codigo == 1) {
			valorPagar = quantidade * 4;
			
			System.out.println("Total: R$ " + String.format("%.2f", valorPagar));
		}
		
		if (codigo == 2) {
			valorPagar = quantidade * 4.50;
			
			System.out.println("Total: R$ " + String.format("%.2f", valorPagar));
		}
		
		if (codigo == 3) {
			valorPagar = quantidade * 5;
			
			System.out.println("Total: R$ " + String.format("%.2f", valorPagar));
		}
		
		if (codigo == 4) {
			valorPagar = quantidade * 2;
			
			System.out.println("Total: R$ " + String.format("%.2f", valorPagar));
		}
		
		if (codigo == 5) {
			valorPagar = quantidade * 1.5;
			
			System.out.println("Total: R$ " + String.format("%.2f", valorPagar));
		}	

	}

}
