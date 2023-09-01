package leetcode.Random;

public class bulbSwitcher {
    public int bulb(int n){
        return (int) Math.sqrt(n);  //2.44 => 2
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("The number of bulbs that are on after " +n+ " rounds: " +new bulbSwitcher().bulb(n) );
    } 
} 
//on on on on on on         
//on off on off on off
//on off off off on on
//on off off on on on
//on off off on off on
//on off off on off off