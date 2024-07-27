package exam04;

public class ObjectClone {

	public static void main(String[] args) {

		Point org = new Point(3, 5);
		Point cpy = null;
		
		//System.out.println(org);
		
		try {
			cpy = (Point)org.clone();
			
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

}
