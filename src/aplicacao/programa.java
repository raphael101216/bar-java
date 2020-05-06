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
		double ingresso, couvert, consumo, total;

		// Leitura dos dados

		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetos = sc.nextInt();

		// Calculo

		if (sexo == 'F' || sexo == 'f') {
			ingresso = 8.0;
		} else {
			ingresso = 10.0;
		}

		consumo = cerveja * 5.0 + refri * 3.0 + espetos * 7.0;

		if (consumo > 30) {
			couvert = 0.0;
		} else {
			couvert = 4.0;
		}

		total = ingresso + consumo + couvert;

		// Relatório
		System.out.println();
        System.out.println("RELATÓRIO:");
		System.out.println("Consumo = R$ " + df.format(consumo));
        if(couvert == 0.0) {
        	System.out.println("Insento de Couvert");
        }else {
    		System.out.println("Couvert = R$ " + df.format(couvert));
        }
        System.out.println("Ingresso = R$ " + df.format(ingresso));
        
        System.out.println();
        System.out.println("Valor a pagar = R$ " + df.format(total));
        
        
		sc.close();
	}

}
