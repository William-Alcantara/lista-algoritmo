package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex001Quadadro {
	public static void main (System[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = sc.nextDouble();
		double base = sc.nextDouble();
		double area = altura * base;
		System.out.println("Valor da area é "+ area);
		
		sc.close();
		
	}

}
