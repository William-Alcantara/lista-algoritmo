package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex005CelsiusParaFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double grauCelsius = sc.nextDouble();
		double fahrenheit = grauCelsius*1.8 + 32;
		System.out.printf(" Cesius = %.2f em fahrenheit = %.2f", grauCelsius, fahrenheit);
		sc.close();	}

}
