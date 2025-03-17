package opps;

public class car extends vehicle {
    car(){
        super(2);
        System.out.println("Car class instantiated");
    }

    public void start(){
        super.start();//System.out.println("car is starting");
    }
    public static void main(String[] args) {
        car car1 = new car();
        car1.model= "YYY";
        car1.show();
        car1.wheel= 4;
        car1.show();
        car1.start();
    }
}
