import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int cont = 0;
        
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i < 6; i++) {
        	
        	double n = in.nextDouble();
        	
        	if (n > 0) {
        		cont++;
        	}
        }
        
        System.out.println(cont + " valores positivos");
	}

}
