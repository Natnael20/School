package tester;

import java.util.ArrayList;
import java.util.List;

import com.github.Student;

public class School {
	
	private List<schoolClass> classes;
	private List<Student> students;
	private List<Teacher> teachers;
	
	public School() {
		this.classes = new ArrayList<>();
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
	}
	
	public void addClassName(schoolClass className) {
		classes.add(className);
	}
	public void removeClass(schoolClass className) {
		classes.remove(className);
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.add(student);
	}
	
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void removeTeachers(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	//Getter for class
	 public List < Student > getStudents() {
		    return students;
	 }

	 public List < Teacher > getTeachers() {
		    return teachers;
	 }

	 public List < schoolClass > getClasses() {
		    return classes;
	 } 
	
}
