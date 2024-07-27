package exam11;

class Personal{
	private String name;
	private String perNum;
	
	
	Personal(String name, String perNum){
		this.name = name;
		this.perNum = perNum;
	}
	
	public String getPerNum() {
		return perNum;
	}
	
	public String getName() {
		return name;
	}
}

// class PersonalStorageThirdparty extends PersonalStorage {


class PersonalStorageThirdparty implements PersonalStorage{
	Personal[] personArr;
	int indexPerInfo;

	PersonalStorageThirdparty(int num){
		
		personArr = new Personal[num];
		indexPerInfo = 0;
		
	}
	
	@Override
	public void addPersonalInfo(String name, String perNum) {
		personArr[indexPerInfo++] = new Personal(name, perNum);
		System.out.println("데이터 저장 완료.");
	}

	@Override
	public String searchName(String perNum) {
		for(int i = 0; i < indexPerInfo; i++) {
			if(perNum.compareTo(personArr[i].getPerNum()) == 0) 
				return personArr[i].getName();
			
		}
		return null;
	}
	
	
}
