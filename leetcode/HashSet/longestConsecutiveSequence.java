package leetcode.HashSet;
import java.util.*;

public class longestConsecutiveSequence {
    public static int longest(int[] arr){
        HashSet<Integer> mySet = new HashSet<>();
        for(int num : arr){
            mySet.add(num);
        }
        int longestStreak=0;
        for(int num : mySet){
            if(!mySet.contains(num-1)){
                int currNum = num; //start of a new consecutive sequence
                int currStreak = 1;
                while(mySet.contains(currNum + 1)){
                    currNum++;
                    currStreak++;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 5};
        //int longest = longest(nums);
        System.out.println(longest(nums));
    }
}
