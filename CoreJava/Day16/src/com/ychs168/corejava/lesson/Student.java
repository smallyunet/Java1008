/*
 * ychs
 */

package com.ychs168.corejava.lesson;

/**
 * 
 * @author Administrator
 *
 */
public class Student {
	String name;
	int age = 19;
	int grade = 2;
	
	/**
	 * @param name
	 * @param age
	 * @param grade
	 */
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("a", 1, 1);
		Student s2 = new Student("a", 1, 1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		
		String s11 = "123";
		s11 = "456";
		System.out.println(s11);
	}
	
}


