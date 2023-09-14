package tester;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School();
		
		Student student1 = new Student ("Josh",20,"Sweden");
		Student student2 = new Student ("Alice",24,"France");
		Student student3 = new Student ("Bob",21,"Norway");
		
		
		school.addStudents(student1);
		school.addStudents(student2);
		school.addStudents(student3);

		Teacher teacher1 = new Teacher("Sarah",40);
		Teacher teacher2 = new Teacher("Michael",34);
		Teacher teacher3 = new Teacher("Lia",28);
		
		school.addTeachers(teacher1);
		school.addTeachers(teacher2);
		school.addTeachers(teacher3);
		
		schoolClass class1 = new schoolClass("AstroBotanicsLab",teacher1,53);
		schoolClass class2 = new schoolClass("CreativeCodingWorkshop",teacher2,0);
		schoolClass class3 = new schoolClass("EthicalDilemmasSeminar",teacher3,100);
		
		school.addClassName(class1);
		school.addClassName(class2);
		school.addClassName(class3);
		
		class1.addStudent(student1);
		class1.addStudent(student2);
		class1.addStudent(student3);
		
		class1.finalResult(student3, 0);
		
	}

}
