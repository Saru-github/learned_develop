package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroArrayList {

	public static void main(String[] args) {

//		Integer num1 = new Integer(10);  
//		Integer num2 = new Integer(20);
//		Integer num3 = new Integer(30);
//		
//		Integer[] num = new Integer[3];
//		num[0] = new Integer(10);
//		num[1] = new Integer(20);
//		num[2] = new Integer(30);
		
		
		ArrayList<Integer> list = new ArrayList<>(); // new ArrayList<Integer>(); 생략가능
		
		// 데이터 (intstance - 참조변수) 저장 방법
		
//		list.add(new Integer(10));
//		list.add(new Integer(20));
//		list.add(new Integer(30));

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		
		// 데이터 참조
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=======================");
		
		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
