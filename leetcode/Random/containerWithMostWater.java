package leetcode.Random;

public class containerWithMostWater {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1; //5
        int maxArea = 0;

        while(left < right){
            int currArea = Math.min(height[left], height[right]) * (right - left); //(1, 3) * 5 => 5  
            maxArea = Math.max(maxArea, currArea);                                //(2, 3) * 4 => 8
                                                                                 //(5, 3) * 3 => 9
            if(height[left] < height[right]) left++; //left++                   //(5, 8) * 2 => 10        
            else right--; //right--                                            //(8, 9) * 1 => 8
        }
        return maxArea; //10
    }
    public static void main(String[] args){
        int[] height = {1,2,5,8,9,3};
        System.out.println("The maximum area is: " +new containerWithMostWater().maxArea(height));
    }
}