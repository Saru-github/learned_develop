package exam11;

//abstract class PersonalStorage 

interface PersonalStorage{

	public /* abstract */ void addPersonalInfo(String name, String perNum);
	public /* abstract */ String searchName(String perNum);
	
	//interface 안에는 public abstract 메서드만 사용가능 하기때문에, 표기를 생각할 수 있다. 
	
}
