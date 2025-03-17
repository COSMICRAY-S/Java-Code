package opps;

public class vehicle {
    public int wheel;
    public String model;

    vehicle(){
        System.out.println("vehicle class instantiated");
    }

    vehicle(int wheel){
        this.wheel=wheel;
        System.out.println("vehicle cons with wheel");
    }
    public void start(){
        System.out.println("Vehicle is starting");
    }
    public void show(){
        System.out.println("wheel: "+wheel + "\nModel: "+ model);
    }
}
