package review;

public class User {
	
	int height;
	int weight;
	String name;
	int age;
	
	
	



	public void showInfo() {
		System.out.println(height+"cm"+weight+"kg"+name+age+"세");
	}
	
	public static void main(String[] args) {
		
		User user = new User();
		user.age = 20;
		user.height = 180; 
		user.weight = 90;
		user.name = "허댕";
		user.showInfo();
	}

}

	
