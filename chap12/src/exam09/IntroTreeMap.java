package exam09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class IntroTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(6, "data6");
		map.put(5, "data5");
		map.put(4, "data4");
		map.put(2, "data2");
		map.put(1, "data1");
		map.put(3, "data3");
		
		
		NavigableSet<Integer> navi = map.navigableKeySet();
		
		
		System.out.println("===오름 차순 ===");
		Iterator<Integer> itr =  navi.iterator();
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
		System.out.println("===내림 차순 ===");
		itr = navi.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
	}

}
