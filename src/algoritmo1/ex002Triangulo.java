package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex002Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double altura = sc.nextDouble();
		double base = sc.nextDouble();
		double area = (altura * base) /2;
		System.out.println("O valor da area do Triangulo é "+ area);
		Locale.setDefault(Locale.US);
		sc.close();
		

	}

}
