package arithmetic;

public class Parity {

	public void showPairs(Double[] number) {
		System.out.println("Dentre os n�meros digitados, s�o pares:");
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 0)
				System.out.print(number[i] + " | ");
		System.out.println();
	}
	
	public void showOdd(Double[] number) {
		System.out.println("Dentre os n�meros digitados, s�o �mpares:");
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 1)
				System.out.print(number[i] + " | ");
		System.out.println();
	}
	
}
