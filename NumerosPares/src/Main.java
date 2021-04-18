
public class Main {

	public static void main(String[] args) {
		int numero = 1;
		int resto;
				
		do {
			resto = numero % 2;
			
			if (resto == 0) {
				System.out.println(numero);
			}
			
			numero++;
			
		}while(numero <= 100);

	}

}
