package main;

import java.util.Scanner;

import matrix.Input;
import matrix.Output;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.printf("Digite o valor de A: ");
		int a = read.nextInt();
		System.out.printf("Digite o valor de B: ");
		int b = read.nextInt();
		System.out.printf("Digite o valor de C: ");
		int c = read.nextInt();
		System.out.printf("Digite o valor de D: ");
		int d = read.nextInt();
		System.out.println();
		
		Input in = new Input();
		
		System.out.println("Declarando matriz A x B...");
		Double[][] matrixAB = in.defineMatrix(a, b);
		System.out.println("Declarando matriz C x D...");
		Double[][] matrixCD = in.defineMatrix(c, d);
		
		Output out = new Output();
		
		System.out.println("A matriz A x B ficou da seguinte forma:");
		out.impressMatrix(matrixAB);
		System.out.println("Verificando diagonal principal da matriz A x B...");
		out.primaryDiagonal(matrixAB);
		System.out.println("Verificando diagonal secundária da matriz A x B...");
		out.secondaryDiagonal(matrixAB);
		System.out.println("A matriz transposta de A x B é:");
		out.transposedMatrix(matrixAB);
	
		System.out.println("A matriz C x D ficou da seguinte forma:");
		out.impressMatrix(matrixCD);
		System.out.println("Verificando diagonal principal da matriz C x D...");
		out.primaryDiagonal(matrixCD);
		System.out.println("Verificando diagonal secundária da matriz C x D...");
		out.secondaryDiagonal(matrixCD);
		System.out.println("A matriz transposta de C x D é:");
		out.transposedMatrix(matrixCD);
		
		System.out.println("Verificando soma das matrizes A x B e C x D...");
		out.matrixSum(matrixAB, matrixCD);
		System.out.println("Verificando multiplicação das matrizes A x B e C x D...");
		out.matrixMultiplication(matrixAB, matrixCD);
	}
}
