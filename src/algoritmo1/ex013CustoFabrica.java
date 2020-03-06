package algoritmo1;

import java.util.Locale;
import java.util.Scanner;

public class ex013CustoFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double custoFabrica = sc.nextDouble();
		double percDistribuidor = custoFabrica * 0.28;
		double impostos = custoFabrica * 0.45;
		double custoConsumidor = custoFabrica + percDistribuidor + impostos;
		System.out.println("Custo consumidor "+custoConsumidor);		
		sc.close();

	}

}
