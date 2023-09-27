package leetcode.Strings;

class minPartition{
    public int minPartition(String n){
        int result = 0;
        for(char c : n.toCharArray()){
            result = Math.max(result, c - '0'); // 3 => 1 + 1 + 1 & 2 => 1 + 1
        }
        return result;
    }
    public static void main(String[] args){
        String n = "32";
        System.out.println("The minimum number of partitions: " +new minPartition().minPartition(n));
    }
}