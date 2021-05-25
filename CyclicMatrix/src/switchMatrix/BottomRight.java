package switchMatrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BottomRight {
	
	public void bottomRight() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try{
				
				System.out.println("***CYCLIC MATRIX M*N - starting from BOTTOM RIGHT corner***");
				System.out.println("Enter dimension of matrix: ");
				
				System.out.println("m:");
				int m = sc.nextInt();
				
				if(m >= 1 && m<=100) {
				
					System.out.println("n: ");
					int n = sc.nextInt();
				
					if(n >= 1 && n <= 100) {
				
						int[][] matrix = new int[m][n];
				
						int i = 1;
						int minRow = 0;
						int minColumn = 0;
						int maxRow = m-1;
						int maxColumn = n-1;
				
						while(i <= m*n) {
					
							// one cycle
							for(int j = maxColumn; j >= minColumn; j--) {  //right to left
								matrix[maxRow][j] = i++;
							}
					
							for(int j = maxRow-1; j >= minRow; j--) {      // bottom to top
								matrix[j][minColumn] = i++;
							}
					
							for(int j = minColumn+1; j <= maxColumn; j++) {  //left to right
								matrix[minRow][j] = i++;
							}
					
							for(int j = minRow+1; j <= maxRow-1; j++) {      // top to bottom
								matrix[j][maxColumn] = i++;
							}
					
							//update pointers
							minColumn++;
							minRow++;
							maxColumn--;
							maxRow--;
						}
				
				for(i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						System.out.print(matrix[i][j] + "\t");
					}
					System.out.println();
				}
				}else {
					System.out.println("Enter whole number bigger than 0 and smaller than 101.");
				}
				}else {
					System.out.println("Enter whole number bigger than 0 and smaller than 101.");
				}
				
			}catch(InputMismatchException n) {
				System.out.println("You have to input whole number bigger than 0 "
						+ "and smaller than 101 for dimension of matrix.");
				
				@SuppressWarnings("unused")
				String c = sc.next();
				
			}catch(NegativeArraySizeException n) {
				System.out.println("You have to input whole number bigger than 0 "
						+ "and smaller than 101 for dimension of matrix.");
				
				@SuppressWarnings("unused")
				String c = sc.next();
			}
			
			System.out.println("Do You wish to continue y or n?");
			String c = sc.next();

			if(c.equalsIgnoreCase("y")) {
				continue;
			}
			if(c.equalsIgnoreCase("n")) {
				SwitchMatrix matrix = new SwitchMatrix();
				matrix.switchMatrix();
			}

			while(!c.equalsIgnoreCase("y") && !c.equalsIgnoreCase("n")){
				System.out.println("Choose y for yes or n for no.");
				c = sc.next();
			}
		}
		
	}

}
