package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex003Rentagulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = sc.nextDouble();
		double base = sc.nextDouble();
		double area = altura*base;
		System.out.println("O valor da area do rentangulo é "+ area);
		
		sc.close();
	

	}

}
