package arithmetic;

import java.util.*;

public class Input {

	Scanner read = new Scanner(System.in);

	public Integer quantityNumbers() {
		
		int quantity;
		
		System.out.printf("Informe a quantidade de números a serem digitados: ");
		quantity = read.nextInt();
		
		return quantity;
	}

	public Double[] userNum(int quantity) {

		Double number[] = new Double[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.printf("Digite o " + (i + 1) + "º número: ");
			number[i] = read.nextDouble();
		}

		return number;
	}

}
