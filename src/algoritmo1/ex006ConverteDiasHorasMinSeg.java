package algoritmo1;

import java.util.Scanner;

public class ex006ConverteDiasHorasMinSeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int anos = sc.nextInt();
		int dias = anos * 365;
		int horas = dias * 24;
		int min = horas * 60;
		int seg = min * 60;
		System.out.println("Anos "+anos
				+" Dias: "+ dias
				+" Horas: "+ horas
				+" Min: "+ min
				+" Seg:"+seg);
		
        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("A idade convertida ficará:");
        System.out.println("Dias: " +(idade*365));
        System.out.println("Horas: " +(idade*8760));
        System.out.println("Minutos: " +(idade*525600));
        System.out.println("Segundos: " +(idade*31536000));
				
		sc.close();
		
		
	}

}
