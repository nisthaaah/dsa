package leetcode.Array;

public class totalTime {
    public int minTimeToVisitAllPoints(int[][] points){
        int time = 0;
        
        for(int i = 0; i < points.length - 1; i++){
            int[] curr = points[i];
            int[] next = points[i + 1];

            int xDiff = Math.abs(next[0] - curr[0]); //next[0] and curr[0] represents the x coordinate of the next and curr point.
            int yDiff = Math.abs(next[1] - curr[1]); //next[1] and curr[1] represents the y coordinate of the next and curr point.

            time += Math.max(xDiff, yDiff);
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, -1}};
        System.out.println("The minimum time to visit all points: " +new totalTime().minTimeToVisitAllPoints(points));
    }
}