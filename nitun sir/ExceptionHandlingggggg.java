public class ExceptionHandlingggggg {

    public static void main(String[] args) {

        //System.out.println("Welcome");

        int a[] = new int[5];
        char ch='\0';
        String s="sagor";
        try{
            ch=s.charAt(5);
        //System.out.println(ch);
        }catch(NullPointerException e){
            System.out.println("Null pointer Exception");
        }catch(StringIndexOutOfBoundsException exe){
            System.out.println("String Out of bound Exception");
        }catch(Exception exec){
            System.out.println(exec);
        }

        // try{
        //     double x=(5/0);
        //     System.out.println();

        // }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
        //     System.out.println("Tried to handle Exception");
        // }catch(ArithmeticException e){
        //     System.out.println("Devided");
        // }

        finally{
            System.out.println("Okay");
        }
        
    }
}