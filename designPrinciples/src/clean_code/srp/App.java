package clean_code.srp;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        new StudentDisplayer().display(student);
        new StudentSaver().save(student);
    }
}
