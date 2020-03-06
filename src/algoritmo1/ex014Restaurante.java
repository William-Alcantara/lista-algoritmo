package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex014Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		double quiloComida = sc.nextDouble();
		double valorComida = (quiloComida/1000)*24.90  ;
		System.out.printf(" O valor pesado é %.2f",valorComida);
		sc.close();

	}

}
