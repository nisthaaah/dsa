package multiThreading.syncronization;

//Using Synchronization Method
class BookTheaterSeat{
    int totalSeats = 10;
   synchronized void bookSeat(int seats){
        if(totalSeats >= seats){
            System.out.println(seats+ " Seats booked successfully :)");
            totalSeats = totalSeats - seats; //10 - 5 => 5
            System.out.println("Seats left: " +totalSeats +"\n"); //5
        }
        else{
            System.out.println("Sorry, " +seats+ " seats cannot be booked....!!");
            System.out.println("Seats left: " +totalSeats);
        }
    }
}
public class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }   

    public static void main(String[] args){
        b = new BookTheaterSeat();

        MovieBookApp user1 = new MovieBookApp();
        user1.seats = 5;
        user1.start();

        MovieBookApp user2 = new MovieBookApp();
        user2.seats = 7;
        user2.start();
    }
}