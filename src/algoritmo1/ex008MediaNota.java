package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex008MediaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double media = (nota1 + nota2 + nota3) /3;
		System.out.println("Medias das notas "+ media);
		sc.close();

	}

}
