package furb.code;

import javax.swing.JOptionPane;

/*Escreva um programa que permita armazenar e manipular matrizes.
Primeiramente o programa vai ler os n�meros informados pelo
usu�rio e armazan�-los numa matriz A de inteiros de ordem 4 X 4;
- Em seguida o programa deve:
1) gerar uma matriz B, que � a transposta de A; 
2) gerar uma matriz C, que � a soma de A e B (C = A + B);
3) gerar uma matriz D, que � o produto de A e B (D = A * B);
4) mostrar as matrizes A, B, C e D;
5) calcular e mostrar o somat�rio dos n�meros da diagonal principal de cada uma das 4 matrizes;
 

O programa ter� os seguintes sub-programas:
1) Um que recebe as refer�ncias de tr�s matrizes, e popula a terceira com a soma das duas primeiras;
2) Um que recebe as refer�ncias de tr�s matrizes, e popula a terceira com o produto das duas primeiras;
3) Um que recebe as refer�ncias de duas matrizes, e popula a segunda como a transposta da primeira;
4) Um que recebe a refer�ncia uma matriz e devolve o somat�rio dos elementos de sua diagonal principal;
5) Um que recebe a refer�ncia a uma matriz e popula a mesma a partir de n�meros digitados pelo usu�rio;
6) Um que recebe a refer�ncia a uma matriz e mostra a mesma ao usu�rio.

OBS.: Somente os sub-programas de n�mero 5 e 6 e o main() podem fazer I/O . 
*/

public class MatrixManipulationEx {
	static int numberOfLines = 4;
	static int numberOfColumns = 4;
	public static void main(String[] args) {


		int[][] matrixA = new int[numberOfLines][numberOfColumns];
		int[][] matrixB = new int[numberOfLines][numberOfColumns];
		int[][] matrixC = new int[numberOfLines][numberOfColumns];
		int[][] matrixD = new int[numberOfLines][numberOfColumns];
		
		fillMatrixWithInput(matrixA);
		
		fillSecondMatrixWithTransposedMatrix(matrixA, matrixB);
		
		fillThirdMatrixWithSumOfTwoMatrices(matrixA, matrixB, matrixC);
		
		fillThirdMatrixWithProductOfTwoMatrices(matrixA, matrixB, matrixD);
		
		int sumOfDiagonalA = getSumOfMainDiagonal(matrixA);
		int sumOfDiagonalB = getSumOfMainDiagonal(matrixB);
		int sumOfDiagonalC = getSumOfMainDiagonal(matrixC);
		int sumOfDiagonalD = getSumOfMainDiagonal(matrixD);
		
		System.out.println("Matriz A");
		printMatrix(matrixA);
		
		System.out.println("Matriz B");
		printMatrix(matrixB);
		
		System.out.println("Matriz C");
		printMatrix(matrixC);
		
		System.out.println("Matriz D");
		printMatrix(matrixD);
		
		System.out.println("Somat�rio dos n�meros da diagonal principal da matriz A: " + sumOfDiagonalA);
		System.out.println("Somat�rio dos n�meros da diagonal principal da matriz B: " + sumOfDiagonalB);
		System.out.println("Somat�rio dos n�meros da diagonal principal da matriz C: " + sumOfDiagonalC);
		System.out.println("Somat�rio dos n�meros da diagonal principal da matriz D: " + sumOfDiagonalD);
		

	}
	
	private static void fillThirdMatrixWithSumOfTwoMatrices(int[][] firstMatrix, int[][] secondMatrix, int[][] thirdMatrix) {
		for (int i = 0; i < numberOfLines; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
	}
	
	private static void fillThirdMatrixWithProductOfTwoMatrices(int[][] firstMatrix, int[][] secondMatrix, int[][] thirdMatrix) {
		for (int i = 0; i < numberOfLines; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				int sum = 0;
				for (int k = 0; k < numberOfLines; k++) {
					sum += (firstMatrix[i][k] * secondMatrix[k][j]);
				}
				thirdMatrix[i][j] = sum;
			}
		}
	}
	
	private static void fillSecondMatrixWithTransposedMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		for (int i = 0; i < numberOfLines; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				secondMatrix[i][j] = firstMatrix[j][i];
			}
		}
	}
	
	private static int getSumOfMainDiagonal(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < numberOfLines; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}
	
	private static void fillMatrixWithInput(int[][] matrix) {
		String input;
		for (int i = 0; i < numberOfLines; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				input = JOptionPane.showInputDialog("Informe o elemento presente na posi��o " + (i + 1) + " | " + (j + 1));
				matrix[i][j] = Integer.parseInt(input);
			}
		}
	}
	
	private static void printMatrix(int[][] matrix) {
	     for (int i=0; i < numberOfLines; i++){
	    	 System.out.println("\n");
	    	 for (int j=0; j < numberOfColumns; j++) {
	    		 System.out.print("\t"+matrix[i][j]);
	    	 }
	      }
    	 System.out.println("\n");
	}
		
}
