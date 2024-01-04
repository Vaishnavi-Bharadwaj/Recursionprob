//Count total paths in a maze to move from (0,0) to (n,m) where only down and right directions are allowed(backtracking is used here)
//Time complexity is high and hence dynamic programming approach(AdvancedRecursion3) should be used 
import java.util.*;
public class AdvancedRecursion2 {
    public static int countPaths(int i, int j, int n, int m)
    {
        if(i==n || j==m) //base case 1: when boundary is encountered, do nothing 
            return 0; 
        if(i==n-1 && j==m-1) //base case 2: there is no other path since the last position is encountered and stay in the same position
            return 1;
        //move downwards
        int downPaths=countPaths(i+1,j,n,m); //i value is increased by one while moving downwards
        //move right
        int rightPaths=countPaths(i,j+1,n,m); //j value is increased by one while moving right
        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int totalPaths=countPaths(0,0,n,m);
        System.out.println(totalPaths);
    }
    
}
