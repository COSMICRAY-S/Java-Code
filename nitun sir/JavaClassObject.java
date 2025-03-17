public class JavaClassObject{
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

        JavaClassObject st1 = new JavaClassObject();
        JavaClassObject st2 = new JavaClassObject();
        JavaClassObject st3 = new JavaClassObject();

        st1.setID_no(1);
        st1.setName("sagor");
        st2.setID_no(2);
        st2.setName("badshah");
        st3.setID_no(3);
        st3.setName("shah_alom");

        System.out.printf("%-10s %-15s\n", "ID No", "Name");
        System.out.println("---------------------");

        st1.displayData();
        st2.displayData();
        st3.displayData();
    }
}
