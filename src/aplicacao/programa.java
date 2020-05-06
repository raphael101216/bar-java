package aplicacao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
	  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char sexo;
		int cerveja, refri, espetos;
		
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetos = sc.nextInt();
		
		
		
		
       sc.close();
	}

}
