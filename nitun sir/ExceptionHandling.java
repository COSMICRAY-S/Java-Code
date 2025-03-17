class ExceptionHandling{
    public static void main(String[] args) {
        int a,b; float r;
        a=5; b=0;
        try{
            r=a/b;
            System.out.println("Result is "+ r);
        }
        catch(ArithmeticException e){
            System.out.println("B is zero");
        }

        System.out.println("Program reached this line");
    }
}