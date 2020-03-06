package algoritmo1;

import java.util.Scanner;

public class ex016IdadeMesesHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		int meses = idade * 12;
		int horas = idade *  8760;
		System.out.println("Meses "+meses);
		System.out.println("Horas "+horas);
		
		sc.close();

	}

}
