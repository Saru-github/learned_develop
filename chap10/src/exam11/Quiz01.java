package exam11;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] lotto = new int[6];
		int num = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
				lotto[i] = random.nextInt(45)+1;
			}
			}
			System.out.println(lotto[i]);
			
		}
		
		
	}

}
