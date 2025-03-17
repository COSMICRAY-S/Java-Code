 class MyException extends Exception{
    int details;
    MyException(int a){
        details= a;
    }
    public String toString(){
        return "MyException "+ details + " ";
    }
 }
 
 public class UserDefinedExc {
    static void comp(int a) throws MyException{
        System.out.println("compute " + a);
        if(a>10){
            throw new MyException(a);
        }
        else{
            System.out.println("Exit");
        }
    }
    public static void main(String [] args){
        try{
            comp(1);
            comp(15);
        }catch(MyException e){
            System.out.println("Caught "+ e);
        }
    }
}
