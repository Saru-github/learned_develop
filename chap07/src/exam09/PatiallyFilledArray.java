package exam09;

public class PatiallyFilledArray {

	public static void main(String[] args) {

		// int[][] arr = new int[][] {};
		int[][] arr = {
						{0, 1, 2, 3},
						{4, 5, 6, 7},
						{8, 9, 10, 11}
						};
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);

			}
		}
		
		
		int[][] ragged = {
				{0, 1},
				{4, 5, 6},
				{8, 9, 10, 11}
				};
		
		for (int i = 0; i < ragged.length; i++) {
			for (int j = 0; j < ragged[i].length; j++) {
				System.out.println("ragged[" + i + "][" + j + "] = " + ragged[i][j]);

			}
		}

		
	}

}
