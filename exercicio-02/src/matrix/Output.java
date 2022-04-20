package matrix;

import java.util.Scanner;

public class Output {

	public void impressMatrix(Double[][] matrix) {

		int line = matrix.length;
		int column = matrix[0].length;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf(" " + matrix[i][j] + " |");
			}
			System.out.println();
		}
	}

	public void primaryDiagonal(Double[][] matrix) {

		if (matrix.length == matrix[0].length) {
			int line = matrix.length;
			int column = matrix[0].length;

			System.out.println("Diagonal principal:");
			
			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					if (i == j) {
						System.out.printf(" " + matrix[i][j] + " |");
					}
				}
			}
			System.out.println();
		} else {
			System.out.println("O número de linhas e colunas da matriz não são iguais!");
		}

	}

	public void secondaryDiagonal(Double[][] matrix) {

		if (matrix.length == matrix[0].length) {
			int line = matrix.length;
			int j = line - 1;

			System.out.println("Diagonal secundária:");

			for (int i = 0; i < line; i++) {
				System.out.printf(" " + matrix[i][j--] + " |");
			}

			System.out.println();
		} else {
			System.out.println("O número de linhas e colunas da matriz não são iguais!");
		}
	}

	public void transposedMatrix(Double[][] matrix) {

		Double[][] transposedMatrix = new Double[matrix[0].length][matrix.length];

		int line = transposedMatrix.length;
		int column = transposedMatrix[0].length;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				transposedMatrix[i][j] = matrix[j][i];
				System.out.printf(" " + transposedMatrix[i][j] + " |");
			}
			System.out.println();
		}
	}

	public void matrixSum(Double[][] matrixX, Double[][] matrixY) {
		if (matrixX.length == matrixY.length && matrixX[0].length == matrixY[0].length) {

			int line = matrixX.length;
			int column = matrixX[0].length;

			Double[][] sum = new Double[line][column];

			System.out.println("A soma das matrizes é:");

			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					sum[i][j] = matrixX[i][j] + matrixY[i][j];
					System.out.printf(" " + sum[i][j] + " |");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"A soma das matrizes não é possível, pois o número de linhas e colunas das mesmas não são iguais!");
		}
	}

	public void matrixMultiplication(Double[][] matrixX, Double[][] matrixY) {
		if (matrixX[0].length == matrixY.length) {

			Double sum = 0.0;
			Double[][] mult = new Double[matrixX.length][matrixY[0].length];

			System.out.println("A multiplicação das matrizes é:");

			for (int i = 0; i < matrixX.length; i++) {
				for (int j = 0; j < matrixY[0].length; j++) {
					for (int k = 0; k < matrixX[0].length; k++) {
						sum = sum + matrixX[i][k] * matrixY[k][j];
					}
					mult[i][j] = sum;
					sum = 0.0;
					System.out.printf(" " + mult[i][j] + " |");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"A multiplicação das matrizes não é possível, pois o número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz!");
		}
	}

}
