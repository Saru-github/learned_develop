package main;

import java.util.HashSet;
import java.util.Scanner;

public class lv38_3052 {

	public static void main(String[] args) {

//		3052
//		
//		입력
//		첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//		출력
//		첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			h.add(a % 42);

		}

		System.out.println(h.size());
	}

}
