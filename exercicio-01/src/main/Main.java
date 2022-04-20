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
				mean.arithmeticMean(number);
			}
				break;
			case 2: {
				mean.geometricMean(number);
			}
				break;
			case 3: {
				parity.showPairs(number);
			}
				break;
			case 4: {
				parity.showOdd(number);
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
