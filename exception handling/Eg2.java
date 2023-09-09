public class Eg2 {
    public static void main(String[] args){
        System.out.println("1");
        try{
            System.out.println("2");
            int a = 100, b = 0;
            int c = a/b; //50

            System.out.println(c);
            System.out.println("3"); //code after the exception will not be executed
            System.out.println("4");
        }
            
            catch(ArithmeticException e){
                e.printStackTrace(); //name, description, stack trace
                System.out.println(e); //name, description
                System.out.println(e.toString()); //name, description
                System.out.println(e.getMessage()); //description
                System.out.println("5");
            }

        try{
            String s = null;
            System.out.println(s.length());
        }
        finally{
            System.out.println("I am in finally block");
        }

        System.out.println("weeee");
    }
}