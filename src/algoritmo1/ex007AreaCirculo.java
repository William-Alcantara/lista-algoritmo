package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex007AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			double raio = sc.nextDouble();
			double area = Math.PI * Math.sqrt(raio);
			System.out.printf("A area do circulo é %.2f", area);
			sc.close();
	}
}
