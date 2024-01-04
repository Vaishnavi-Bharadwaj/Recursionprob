//Place tiles of size 1xm in a floor of size nxm
import java.util.*;
public class AdvancedRecursion3 {
    public static int placeTiles(int n, int m )
    {
        if(n==m) //base case1
            return 2;
        if(n<m) //base case 2
            return 1;
        //tiles vertically placed
        int vertPlacements=placeTiles(n-m,m);

        //tiles horizontally placed
        int horPlacements=placeTiles(n-1,m);

        return vertPlacements+horPlacements;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        int result=placeTiles(n,m);
        System.out.println(result);
    }
}
