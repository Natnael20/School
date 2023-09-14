package tester;

import java.util.ArrayList;
import java.util.List;

import com.github.Student;

public class schoolClass {
    private String className;
    private int testResult;
    private Teacher teacher;
    private List<Student> students;

    // Constructor
    public schoolClass(String className, Teacher teacher, int testResult) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
        this.testResult = testResult;
    }

    // Getter for className
    public String getClassName() {
        return className;
    }

    // Setter for className
    public void setClassName(String className) {
        this.className = className;
    }
    
    //getter for test
    public int gettestResult() {
    	return testResult;
    }
    
    //setter for test;
    public void settestResult(int testResult) {
    	this.testResult = testResult;
    }
    
    // Getter for teacher
    public Teacher getTeacher() {
        return teacher;
    }

    // Setter for teacher
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Getter for students
    public List<Student> getStudents() {
        return students;
    }

    // Setter for students
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
    
    public void finalResult(Student student, int testResult) {
        //grades
        boolean pass = false;
        for(int i=35; i <=100; i++) {
            if(testResult == i) {
                System.out.println("Pass");
                pass = true;
                break;
            }
        }

        if (!pass) {
            System.out.println("fail");
            students.remove(student);
        }
    }
    
}
