package cyclicMatrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CyclicMatrixNN {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("CYCLIC MATRIX N*N");
			System.out.println("Enter dimension of matrix: ");
			int n = sc.nextInt();
			
			if(n<=100) {
			int[][] matrix = new int[n][n];
			
			int i = 1;
			int minRow = 0;
			int minColumn = 0;
			int maxRow = n-1;
			int maxColumn = n-1;
			
			while(i <= n*n) {
				
				// one cycle
				for(int j = minColumn; j <= maxColumn; j++) {  //left to right
					matrix[minRow][j] = i++;
				}
				
				for(int j = minRow+1; j <= maxRow; j++) {      // top to bottom
					matrix[j][maxColumn] = i++;
				}
				
				for(int j = maxColumn-1; j >= minColumn; j--) {  //right to left
					matrix[maxRow][j] = i++;
				}
				
				for(int j = maxRow-1; j >= minRow+1; j--) {      // bottom to top
					matrix[j][minColumn] = i++;
				}
				
				//update pointers
				minColumn++;
				minRow++;
				maxColumn--;
				maxRow--;
			}
			
			for(i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
			}else {
				System.out.println("Enter whole number smaller than 100.");
			}
			sc.close();
		}catch(InputMismatchException n) {
			System.out.println("You have to input whole number bigger than 0 for dimension of matrix.");
		}catch(NegativeArraySizeException n) {
			System.out.println("You have to input whole number bigger than 0 for dimension of matrix.");
		}
		
	}

}
