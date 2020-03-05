package algoritmo1;

import java.util.Scanner;

public class ex010Expressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 int C = sc.nextInt();
		 int D = (A+B)*2;
		 int S = (B+C)*2;
		 int R = (D+S)/2;
		 System.out.println("O valor da expressão é "+R);
		sc.close();

	}

}
