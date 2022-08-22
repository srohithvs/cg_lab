package Inheritance;

import java.util.Scanner;

public class Person {
	private String name;
	private float age;
	
	public Person() {
		
	}

	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		float age = sc.nextFloat();
		
		Person p = new Person(name, age);
		
		System.out.println(p);
		
		sc.close();
	}

}
