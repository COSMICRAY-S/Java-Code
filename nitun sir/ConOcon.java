// Student.java: illustrates specification of a class called Student using constructors to initialize values to its fields.
// MyStudent.java: a separate class with main method instantiating objects of class Student and accessing its members
public class ConOcon {
    public static void main(String[] args) {
        Student student1 = new Student();
    
        Student student2 = new Student(2, "John");
        student1.displayData();
    
        student1.setID_no(1);
        student1.setName("Rama");
        student1.displayData();
        
        student2.displayData();
    }
}
class Student {
    int id_no;
    String name;

    Student() {
        id_no = 0;
        name = "";
    }
    Student(int my_id, String my_name) {
        id_no = my_id;
        name = my_name;
    }
    public void setID_no(int my_id) {
        id_no = my_id;
    }
    public void setName(String my_name) {
        name = my_name;
    }
    public void displayData() {
        System.out.println("ID No: " + id_no);
        System.out.println("Name: " + name);
    }
}