package switchMatrix;

import java.util.Scanner;

public class SwitchMatrix {
	
	public void switchMatrix() {
		
		TopLeft tl = new TopLeft();
		TopRight tr = new TopRight();
		BottomRight br = new BottomRight();
		BottomLeft bl = new BottomLeft();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select number from which corner You want to start the matrix: ");
		System.out.println("1 - Top left corner.");
		System.out.println("2 - Top right corner.");
		System.out.println("3 - Bottom right corner.");
		System.out.println("4 - Bottom left corner.");
		System.out.println("5 - Exit.");
		
		do {
		String selection = sc.next();
		
			switch(selection){
				case "1": tl.topLeft();
					break;
				case "2": tr.topRight();
					break;
				case "3": br.bottomRight();
					break;
				case "4": bl.bottomLeft();
					break;
				case "5": System.exit(0);
				default: System.out.println("Choose 1,2,3 or 4.");
					break;
			}	
		
		}while(true);

	}
	
}

