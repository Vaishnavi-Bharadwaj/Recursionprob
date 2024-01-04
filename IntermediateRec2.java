//Print a string in reverse
//Time Complexity: O(n) where n is the length of the string
import java.util.*;
public class IntermediateRec2 {
    public static void printRev(String str, int idx)
    {
        if(idx==0) //base case: the last element is encountered 
        {
            //print the last index value and then return
            System.out.println(str.charAt(idx)); 
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        printRev(str, str.length()-1); //str.length()-1 gives the last index
    }
}
