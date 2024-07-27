package exam02;

public class StringMethod {

	public static void main(String[] args) {

		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
		String str4 = null;
		
		System.out.println("Smart" + " and " + "Simple");
		System.out.println(str1.concat(str2).concat(str3));
		
		str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);
		
		if(str1.compareTo(str3) < 0) {
			System.out.println("str1 문자열이 str3 문자열보다 사전의 앞에 나온다.");
		} else if (str1.compareTo(str3) == 0){
			System.out.println("str1 문자열과 str3 문자열이 같다.");
		} else {
			System.out.println("str1 문자열이 str3 문자열보다 사전의 뒤에 나온다.");
		}
		
	}

}
