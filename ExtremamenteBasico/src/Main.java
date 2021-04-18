import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		int X;
		
		Scanner in = new Scanner(System.in);
		
		A = in.nextInt();
		B = in.nextInt();
		
		X = A + B;
		
		System.out.print("X = " + X + "\n");
	}

}
