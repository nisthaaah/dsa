package multiThreading.syncronization;

class BookTheaterSeat{
    int totalSeats = 10;
   synchronized void bookSeat(int seats){
        if(totalSeats >= seats){
            System.out.println(seats+ " Seats booked successfully");
            totalSeats = totalSeats - seats; //10 - 5 => 5
            System.out.println("Seats left: " +totalSeats); //5
        }
        else{
            System.out.println("Seats cannot be booked");
            System.out.println("Seats left: " +totalSeats);
        }
    }
}
public class movieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }   

    public static void main(String[] args){
        b = new BookTheaterSeat();

        movieBookApp user1 = new movieBookApp();
        user1.seats = 5;
        user1.start();

        movieBookApp user2 = new movieBookApp();
        user2.seats = 7;
        user2.start();
    }
}