package exam03;

import java.util.HashSet;
import java.util.Iterator;

public class IntroHashSet {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>(); // new ArrayList<Integer>(); 생략가능

		// 데이터 저장
		set.add(10); // Auto Boxing
		set.add(20);
		set.add(30);
		set.add(20);

		// 데이터 참조
//		
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.get(i));
//		}

		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 데이터 삭제
		System.out.println("=======================");
		set.remove(10); // index 값이 아니라, object의 값을 넣어 삭제해야 한다.
		
		itr = set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=======================");
		for (Integer e : set) {
			System.out.println(e);
		}
		
		
		HashSet<String> str = new HashSet<>();
		str.add("홍길동");
		str.add("강감찬");
		str.add("홍길동");
		str.add("이순신");
		
		System.out.println("=======================");
		for (String e : str) {
			System.out.println(e);
		}
		
	}

}
