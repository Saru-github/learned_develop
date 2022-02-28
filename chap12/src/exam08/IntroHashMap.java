package exam08;

import java.util.HashMap;

public class IntroHashMap {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		
		map.put("이름", "홍길동");
		map.put("주소", "서울시 종로구");
		map.put("이메일", "abc@aaa.com");
		map.put("전화번호", "010-1111-1111");
		map.put("거주지", "경기도");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("주소"));
		System.out.println(map.get("이메일"));
		System.out.println(map.get("전화번호"));
		System.out.println(map.get("거주지"));
		
		map.remove("주소");
		
		System.out.println(map.get("주소"));
		
	}

}
