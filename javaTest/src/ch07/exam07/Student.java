package ch07.exam07;

import java.util.Objects;

public class Student {
	private String name;
	private double grade;
	
	public Student() {
		this(null, 0.0); 
	}
	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, grade);
	}
	@Override
	public boolean equals(Object obj) {
		Student stu = null; 
		if(!(obj instanceof Student)) {
			return false; 
		}
		stu = (Student)obj;
		if(this.name.equals(stu.name) && this.grade == stu.grade) {
			return true; 
		}
		return false;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", grade=" + grade + "]";
	}
}
