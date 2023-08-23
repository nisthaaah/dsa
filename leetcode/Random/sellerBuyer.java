package leetcode.Random;

public class sellerBuyer {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }}
        }
        return maxProfit;
    }
    public static void main(String[] args){
        //sellerBuyer sb = new sellerBuyer();
        int[] prices = {6,7,3,4,10};
        System.out.println("Max Profit: " + new sellerBuyer().maxProfit(prices)); //avoids the need to create a separate instance of the class using sb
        //System.out.println("Max Profit: " + sb.maxProfit(prices));
    }   
}
