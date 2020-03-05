package algoritmo1;

import java.util.Scanner;

public class ex011FestaAniversario {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int qtdConvidados = sc.nextInt();
		double centoSalgado = sc.nextDouble();
		double centoDoce = sc.nextDouble();
		double refri2Litros = sc.nextDouble();
		double salgados = (qtdConvidados *15)*(centoSalgado/100); 
		double doces = (qtdConvidados * 10)*(centoDoce/100);
		double refri = (qtdConvidados * 500)*(refri2Litros/2.000);
		System.out.println("Salgados "+salgados);
		System.out.println("Doces "+doces);
		System.out.println("Refrigerante "+refri);
		
		sc.close();
	}

}
