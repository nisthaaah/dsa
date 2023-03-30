import java.util.Scanner;

class oneD{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int number[]= new int[size];

    //input
    for(int i=0; i<size; i++){
        number[i] = sc.nextInt();
    }
    int x=sc.nextInt();

    //output
    for(int i=0; i<size; i++){
        if(number[i]==x){
    System.out.println("x found at" +i);
    }
    
    else{
    System.out.println("x not found");    
        
    }}
}
}
    //int[] age = new int[4]; 
    //int[] age = {19,29,79,99};
    //age[0]=19;
    //age[1]=29;
    //age[2]=79;
    //age[3]=99;
    //System.out.println(age[0]);
    //System.out.println(age[1]);
    //System.out.println(age[2]);
    //System.out.println(age[3]);
    //for(int i=0; i<4; i++){
        //System.out.println(age[i]);
    //}