package exam06;

// import java.util.HashSet;
import java.util.TreeSet;

public class IntroTreeSet {

	public static void main(String[] args) {

		// HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		//데이터 저장
		set.add("First");
		set.add("Third");
		set.add("Second");
		set.add("Second");
		set.add("Fourth");
		
		System.out.println(set.size());
		
		for(String e : set) {
			System.out.println(e);   // First -> Second 순이 아닌, 알파벳 순으로 정렬됨 
		}
		
	}

}
