package exam01;

class Student extends Friend { // 학생 친구

	private String university; // 학교 이름
	private String major; // 전공

	Student(String name, String birth, String address, String email, String university, String major) {

		super(name, birth, address, email);
		this.university = university;
		this.major = major;
	}

	public void displayStudentInfo() {

		displayFriendInfo();
		System.out.println("학교명: " + university);
		System.out.println("전공: " + major);
	}

}
