public class ClassObject {
    int id_no;
    String name;

    public void setID_no(int my_id) {
        id_no = my_id;
    }

    public void setName(String my_name) {
        name = my_name;
    }

    public void displayData() {
        System.out.printf("%-10d %-15s\n", id_no, name);
    }

    public static void main(String[] args) {

        ClassObject st1 = new ClassObject();
        ClassObject st2 = new ClassObject();
        ClassObject st3 = new ClassObject();

        st1.setID_no(1);
        st1.setName("Rama");

        st2.setID_no(2);
        st2.setName("John");

        st3.setID_no(3);
        st3.setName("Alice");

        System.out.printf("%-10s %-15s\n", "ID No", "Name");
        System.out.println("---------------------------");

        st1.displayData();
        st2.displayData();
        st3.displayData();
    }
}
