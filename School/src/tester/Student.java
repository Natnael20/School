package tester;

public class Student {
     String name;
     int age;
     String country;

    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

	// Getter and Setter for name
    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void display() {
    	System.out.println("Name: " + getName());
    	System.out.println("Age: " + getAge());
    	System.out.println("Country: " + getCountry());
    }
}
