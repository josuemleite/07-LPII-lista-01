package main;

import java.util.Scanner;

import matrix.Input;
import matrix.Matrix;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.printf("Digite o valor de A: ");
		int a = read.nextInt();
		System.out.printf("Digite o valor de B: ");
		int b = read.nextInt();
		System.out.println();
		System.out.printf("Digite o valor de C: ");
		int c = read.nextInt();
		System.out.printf("Digite o valor de D: ");
		int d = read.nextInt();
		System.out.println();

		Input in = new Input();

		System.out.println("Declarando matriz A x B...");
		Double[][] matrixAB = in.defineMatrix(a, b);
		System.out.println();
		System.out.println("Declarando matriz C x D...");
		Double[][] matrixCD = in.defineMatrix(c, d);
		System.out.println();

		Matrix matrix = new Matrix();
		Double[] vector;
		Double[][] matrixAux;

		System.out.println("--------------------------------------------------------------------------");

		System.out.println();
		System.out.println("A matriz A x B ficou da seguinte forma:");
		matrix.impressMatrix(matrixAB);
		System.out.println();

		System.out.println("Verificando diagonal principal da matriz A x B...");
		if (matrixAB.length == matrixAB[0].length) {
			System.out.println("Diagonal principal:");
			vector = matrix.primaryDiagonal(matrixAB);
			for (int i = 0; i < matrixAB.length; i++) {
				for (int j = 0; j < matrixAB.length; j++) {
					if (i == j) {
						System.out.print(" " + vector[i] + " |");
					} else {
						System.out.print("  •  |");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("O número de linhas e colunas da matriz não são iguais!");
		}
		System.out.println();

		System.out.println("Verificando diagonal secundária da matriz A x B...");
		if (matrixAB.length == matrixAB[0].length) {
			System.out.println("Diagonal secundária:");
			vector = matrix.secondaryDiagonal(matrixAB);
			for (int i = 0; i < matrixAB.length; i++) {
				for (int j = matrixAB.length; j > 0; j--) {
					if (i == j - 1) {
						System.out.print(" " + vector[i] + " |");
					} else {
						System.out.print("  •  |");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("O número de linhas e colunas da matriz não são iguais!");
		}
		System.out.println();

		System.out.println("A matriz transposta de A x B é:");
		matrixAux = matrix.transposedMatrix(matrixAB);
		for (int i = 0; i < matrixAux.length; i++) {
			for (int j = 0; j < matrixAux[0].length; j++) {
				System.out.print(" " + matrixAux[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("--------------------------------------------------------------------------");

		System.out.println();
		System.out.println("A matriz C x D ficou da seguinte forma:");
		matrix.impressMatrix(matrixCD);
		System.out.println();

		System.out.println("Verificando diagonal principal da matriz C x D...");
		if (matrixCD.length == matrixCD[0].length) {
			System.out.println("Diagonal principal:");
			vector = matrix.primaryDiagonal(matrixCD);
			for (int i = 0; i < matrixCD.length; i++) {
				for (int j = 0; j < matrixCD.length; j++) {
					if (i == j) {
						System.out.print(" " + vector[i] + " |");
					} else {
						System.out.print("  •  |");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("O número de linhas e colunas da matriz não são iguais!");
		}
		System.out.println();

		System.out.println("Verificando diagonal secundária da matriz C x D...");
		if (matrixCD.length == matrixCD[0].length) {
			System.out.println("Diagonal secundária:");
			vector = matrix.secondaryDiagonal(matrixCD);
			for (int i = 0; i < matrixCD.length; i++) {
				for (int j = matrixCD.length; j > 0; j--) {
					if (i == j - 1) {
						System.out.print(" " + vector[i] + " |");
					} else {
						System.out.print("  •  |");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("O número de linhas e colunas da matriz não são iguais!");
		}
		System.out.println();

		System.out.println("A matriz transposta de C x D é:");
		matrixAux = matrix.transposedMatrix(matrixCD);
		for (int i = 0; i < matrixAux.length; i++) {
			for (int j = 0; j < matrixAux[0].length; j++) {
				System.out.print(" " + matrixAux[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Verificando soma das matrizes A x B e C x D...");
		if (matrixAB.length == matrixCD.length && matrixAB[0].length == matrixCD[0].length) {
			System.out.println("A soma das matrizes é:");
			matrixAux = matrix.matrixSum(matrixAB, matrixCD);
			for (int i = 0; i < matrixAB.length; i++) {
				for (int j = 0; j < matrixAB[0].length; j++) {
					System.out.printf(" " + matrixAux[i][j] + " |");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"A soma das matrizes não é possível, pois o número de linhas e colunas das mesmas não são iguais!");
		}
		System.out.println();

		System.out.println("Verificando multiplicação das matrizes A x B e C x D...");
		if (matrixAB[0].length == matrixCD.length) {
			System.out.println("A multiplicação das matrizes é:");
			matrixAux = matrix.matrixMultiplication(matrixAB, matrixCD);
			for (int i = 0; i < matrixAB.length; i++) {
				for (int j = 0; j < matrixCD[0].length; j++) {
					System.out.printf(" " + matrixAux[i][j] + " |");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"A multiplicação das matrizes não é possível, pois o número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz!");
		}
	}
}
