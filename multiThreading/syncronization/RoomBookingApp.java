package multiThreading.syncronization;

//Using Static Synchronization 
class BookRoom{
   static int totalRooms = 40;
   synchronized static void bookRoom(int rooms){
        if(totalRooms >= rooms){
            System.out.println(rooms+ " Rooms booked successfully :)");
            totalRooms = totalRooms - rooms; 
            System.out.println("Rooms left: " +totalRooms +"\n"); 
        }
        else{
            System.out.println("Sorry, " +rooms+ " rooms are unavailable....!!");
            System.out.println("Rooms left: " +totalRooms +"\n");
        }
    }
}

class myThread1 extends Thread{
    BookRoom r;
    int rooms;
    myThread1(BookRoom r, int rooms){
        this.r = r;
        this.rooms = rooms;
    }
    public void run(){ 
        r.bookRoom(rooms);
    }
}

class myThread2 extends Thread{
    BookRoom r;
    int rooms;
    myThread2(BookRoom r, int rooms){
        this.r = r;
        this.rooms = rooms;
    }
    public void run(){
        r.bookRoom(rooms);
    }
}

public class RoomBookingApp {
    public static void main(String[] args){
        BookRoom r1 = new BookRoom();
        myThread1 t1 = new myThread1(r1, 10);
        t1.start();

        myThread1 t2 = new myThread1(r1, 5);
        t2.start();
        
        //---------------------------------------

        BookRoom r2 = new BookRoom();
        myThread2 t3 = new myThread2(r2, 45);
        t3.start();

        myThread2 t4 = new myThread2(r2, 5);
        t4.start();
    }
}