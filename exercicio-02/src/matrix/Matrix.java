package matrix;

import java.util.Scanner;

public class Matrix {

	private Double[] vector;
	private Double[][] matrix;
	private int line;
	private int column;

	public void impressMatrix(Double[][] matrix) {

		line = matrix.length;
		column = matrix[0].length;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf(" " + matrix[i][j] + " |");
			}
			System.out.println();
		}
	}

	public Double[] primaryDiagonal(Double[][] matrix) {

		line = matrix.length;
		column = matrix[0].length;

		this.vector = new Double[line];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j) {
					this.vector[i] = matrix[i][j];
				}
			}
		}

		return this.vector;
	}

	public Double[] secondaryDiagonal(Double[][] matrix) {

		line = matrix.length;
		this.vector = new Double[line];

		int j = line - 1;

		for (int i = 0; i < line; i++) {
			this.vector[i] = matrix[i][j--];
		}

		return this.vector;
	}

	public Double[][] transposedMatrix(Double[][] matrix) {

		this.matrix = new Double[matrix[0].length][matrix.length];

		line = this.matrix.length;
		column = this.matrix[0].length;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				this.matrix[i][j] = matrix[j][i];
			}
		}

		return this.matrix;
	}

	public Double[][] matrixSum(Double[][] matrixX, Double[][] matrixY) {

		line = matrixX.length;
		column = matrixX[0].length;

		this.matrix = new Double[line][column];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				this.matrix[i][j] = matrixX[i][j] + matrixY[i][j];
			}
		}

		return this.matrix;
	}

	public Double[][] matrixMultiplication(Double[][] matrixX, Double[][] matrixY) {

		this.matrix = new Double[matrixX.length][matrixY[0].length];
		Double sum = 0.0;

		for (int i = 0; i < matrixX.length; i++) {
			for (int j = 0; j < matrixY[0].length; j++) {
				for (int k = 0; k < matrixX[0].length; k++) {
					sum = sum + matrixX[i][k] * matrixY[k][j];
				}
				this.matrix[i][j] = sum;
				sum = 0.0;
			}
		}

		return this.matrix;
	}

}
