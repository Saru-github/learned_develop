package exam07;

public class ArrayAndMethods {

	public static int[] addAllArray(int[] a, int n) {
		n = 10; // 새로운 값 대입.
		
		for (int i = 0; i < a.length; i++) {
			a[i] += 10;
			System.out.println(a[i]);
		}
		
		return a;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int num = 5;
		
		int[] ref = addAllArray(arr, num);
		
		System.out.println("================");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("================");
		
		if(arr == ref) {
			System.out.println("같은 메모리 영역 참조.");
		} else {
			System.out.println("다른 메모리 영역 참조.");
		}
		
		
	}

}
