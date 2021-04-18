import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
        int valor;
        int cont = 0;
        
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
        	valor = in.nextInt();
        	
        	if (valor % 2 == 0 ) {
        		cont++;
        	}
        }
        
        System.out.println(cont + " valores pares");
	}

}
