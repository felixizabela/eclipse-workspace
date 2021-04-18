import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double valor;
		int notas;
		int moedas;
		int divisao;
		
		Scanner in = new Scanner(System.in);
		
		valor = in.nextDouble();
		
		notas = (int)valor;
		moedas = (int) ((valor - notas) * 100);
		
		//Notas
		
		divisao = notas / 100;
		
		System.out.println("NOTAS:");
		System.out.println(divisao + " nota(s) de R$ 100.00");
		
		notas = notas - (divisao * 100);
		
		divisao = notas / 50;		
		
		System.out.println(divisao + " nota(s) de R$ 50.00");
		
		notas = notas - (divisao * 50);
		
		divisao = notas / 20;	
		
		System.out.println(divisao + " nota(s) de R$ 20.00");
		
		notas = notas - (divisao * 20);
		
		divisao = notas / 10;		
		
		System.out.println(divisao + " nota(s) de R$ 10.00");
		
		notas = notas - (divisao * 10);
		
		divisao = notas / 5;	
		
		System.out.println(divisao + " nota(s) de R$ 5.00");
		
		notas = notas - (divisao * 5);
		
		divisao = notas / 2;		
		
		System.out.println(divisao + " nota(s) de R$ 2.00");
		
		notas = notas - (divisao * 2);
		
		//Moedas
				
		System.out.println("MOEDAS:");
		System.out.println(notas + " moeda(s) de R$ 1.00");
		
		divisao = moedas / 50;	
		
		System.out.println(divisao + " moeda(s) de R$ 0.50");
		
		moedas = moedas - (divisao * 50);
		
		divisao = moedas / 25;	
		
		System.out.println(divisao + " moeda(s) de R$ 0.25");
		
		moedas = moedas - (divisao * 25);
		
		divisao = moedas / 10;
		
		System.out.println(divisao + " moeda(s) de R$ 0.10");
		
		moedas = moedas - (divisao * 10);
		
		divisao = moedas / 5;	
		
		System.out.println(divisao + " moeda(s) de R$ 0.05");
		
		moedas = moedas - (divisao * 5);
		
		divisao = moedas / 1;	
		
		System.out.println(divisao + " moeda(s) de R$ 0.01");
	}

}
