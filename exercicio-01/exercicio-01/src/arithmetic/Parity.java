package arithmetic;

public class Parity {

	Double[] numberAux;
	int count = 0;

	public Double[] showPairs(Double[] number) {
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 0)
				count++;
		this.numberAux = new Double[count];
		for (int i = 0; i < count; ) {
			for (int j = 0; j < number.length; j++) {
				if (number[j] % 2 == 0) {
					this.numberAux[i] = number[j];
					i++;
				}
			}
		}
		count = 0;
		return this.numberAux;
	}

	public Double[] showOdd(Double[] number) {
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 1)
				count++;
		this.numberAux = new Double[count];
		for (int i = 0; i < count; ) {
			for (int j = 0; j < number.length; j++) {
				if (number[j] % 2 == 1) {
					this.numberAux[i] = number[j];
					i++;
				}
			}
		}
		count = 0;
		return this.numberAux;
	}
}
