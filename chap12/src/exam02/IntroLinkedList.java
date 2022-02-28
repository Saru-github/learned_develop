package exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class IntroLinkedList {

	public static void main(String[] args) {

		// ArrayList 에서 LinkedList로 자유롭게 변환가능, 특징에따라 선택하여 쓰자.

		LinkedList<Integer> list = new LinkedList<>(); // new ArrayList<Integer>(); 생략가능

		// 데이터 저장
		list.add(10); // Auto Boxing
		list.add(20);
		list.add(30);
		list.add(20);

		// 데이터 참조
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 데이터 삭제
		System.out.println("=======================");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=======================");

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=======================");
		
		for (Integer e : list) {
			System.out.println(e);
		}

	}

}
