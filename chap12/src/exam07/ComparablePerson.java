package exam07;

import java.util.TreeSet;


class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	
	}

	public void showData() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

	@Override
	public int compareTo(Person o) {

		if ( age > o.age) {
			return 1;
		} else if (age == o.age) {
			return 0;
		} else {
			return -1;
			
		}
	}
	
}
public class ComparablePerson {

	public static void main(String[] args) {

		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("홍길동", 25));
		set.add(new Person("이순신", 27));
		set.add(new Person("강감찬", 30));
		set.add(new Person("안중근", 32));
		set.add(new Person("강감찬", 34));
		set.add(new Person("안중근", 32));

		for(Person e : set) {
			e.showData();
		}
		
	}

}
