package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex09MediaCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double distPercorrida = sc.nextDouble();
		double gastoCombustivel= sc.nextDouble();
		double consumo = distPercorrida / gastoCombustivel;
		System.out.printf("O consumo médio por km %.2f litro",consumo);
			
		sc.close();

	}

}
