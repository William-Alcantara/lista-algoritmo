package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex004Losango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double dimensao1 = sc.nextDouble();
		double dimensao2 = sc.nextDouble();
		double area = (dimensao1 * dimensao2) /2;
		System.out.println("A area de do Losango é "+ area);
		sc.close();

	}

}
