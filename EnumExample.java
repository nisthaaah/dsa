public class EnumExample {
    enum Month{
        January, February, March, April, May, June, July, August, September, October, November, December;
        //these are enum constants
        //are implicitly public, static, final
        //enums cannot be extended using inheritance
        //You cannot create new instances of an enum using the new keyword, and you cannot extend an enum

    Month(){
        System.out.println("Constructor " +this);
    } 
    } 

    public static void main(String[] args) {
        Month month;
        month = Month.December;

        // for(Month m : Month.values()){
        //     System.out.println(m);
        // }

        System.out.println(month.ordinal());
    }
}