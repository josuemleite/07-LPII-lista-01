package main;

import java.util.*;

import arithmetic.Input;
import arithmetic.Mean;
import arithmetic.Parity;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Input input = new Input();
		Mean mean = new Mean();
		Parity parity = new Parity();

		int quantity = input.quantityNumbers();

		Double[] number = input.userNum(quantity);

		while (true) {
			System.out.println("*** Digite um valor correspondente ao item desejado ***");
			System.out.println("[1] - Exibir m�dia aritm�tica");
			System.out.println("[2] - Exibir m�dia geom�trica");
			System.out.println("[3] - Exibir os n�meros pares");
			System.out.println("[4] - Exibir os n�meros �mpares");
			System.out.println("[5] - Sair");

			int option = read.nextInt();

			switch (option) {
			case 1: {
				System.out.println("M�dia aritm�tica: " + mean.arithmeticMean(number));
			}
				break;
			case 2: {
				System.out.println("M�dia geom�trica: " + mean.geometricMean(number));
			}
				break;
			case 3: {
				System.out.println("Dentre os n�meros digitados, s�o pares: ");
				Double[] aux = parity.showPairs(number);
				for (int i = 0; i < aux.length; i++) {
					System.out.print(aux[i] + " | ");
				}
				System.out.println();
			}
				break;
			case 4: {
				System.out.println("Dentre os n�meros digitados, s�o �mpares:");
				Double[] aux = parity.showOdd(number);
				for (int i = 0; i < aux.length; i++) {
					System.out.print(aux[i] + " | ");
				}
				System.out.println();
			}
				break;
			case 5:
				return;
			default:
				System.out.println("Op��o inv�lida!");
			}
		}
	}
}
