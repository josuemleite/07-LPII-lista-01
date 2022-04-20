package aritmetica;

import java.util.*;

public class Aritmetica {
	
	public Double[] userNum(int quantity) {
		
		Scanner read = new Scanner(System.in);
		Double number[] = new Double[quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.printf("Digite o " + (i+1) + "º número: ");
			number[i] = read.nextDouble();
		}
		
		return number;
	}
	
	public void arithmeticMean(Double[] number) {
		
		Double sum = 0.0;
		int length = number.length;
		Double arithmeticAvg;
		
		for (int i = 0; i < length; i++) {
			sum = sum + number[i];
		}
		
		arithmeticAvg = sum / length;
		
		System.out.println("Média aritmética: " + arithmeticAvg);
	}
	
	public void geometricMean(Double[] number) {
		
		Double product = 1.0;
		int length = number.length;
		Double geometricMean;
		
		for (int i = 0; i < length; i++) {
			product = product * number[i];
		}
		
		geometricMean = Math.pow(product, 1/length);
		
		System.out.println("Média geométrica: " + geometricMean);
	}

	public void showPairs(Double[] number) {
		System.out.println("Dentre os números digitados, são pares:");
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 0)
				System.out.print(number[i] + " | ");
		System.out.println();
	}
	
	public void showOdd(Double[] number) {
		System.out.println("Dentre os números digitados, são ímpares:");
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 1)
				System.out.print(number[i] + " | ");
		System.out.println();
	}
}
