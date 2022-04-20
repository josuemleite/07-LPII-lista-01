package arithmetic;

public class Parity {

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
