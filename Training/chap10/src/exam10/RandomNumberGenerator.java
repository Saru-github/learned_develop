package exam10;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		Random random = new Random();
		// new Random(); 에 별도의 값을 넣어주지 않는다면,
		random.setSeed(System.currentTimeMillis()); // 시드 값으로1/1000 초 까지 현재시간으로 불러오게하여, 기준값이 실행마다 달라지고,
													// Random 한 결과인것 처럼 보여지게 된다.

		for (int i = 0; i < 6; i++) {
			System.out.println(random.nextInt(46) + 1); // 10 -> 0~9
		}

	}

}
