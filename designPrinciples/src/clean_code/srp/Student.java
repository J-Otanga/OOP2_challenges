package clean_code.srp;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class StudentDisplayer {
    public void display(Student student) {
        System.out.println("Student: " + student.getName());
    }
}

class StudentSaver {
    public void save(Student student) {
        System.out.println("Saving " + student.getName() + " to file...");
    }
}
