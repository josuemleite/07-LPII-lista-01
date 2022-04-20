package arithmetic;

public class Mean {

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

		geometricMean = Math.pow(product, (double) 1 / length);

		System.out.println("Média geométrica: " + geometricMean);
	}
	
}
