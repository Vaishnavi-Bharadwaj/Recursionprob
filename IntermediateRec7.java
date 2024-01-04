//Print all the subsequences of a string (IMPORTANT QUESTION)
//Time complexity(calculated using the recursive tree): O(2^n) 
import java.util.*;
public class IntermediateRec7 {
    public static void subsequences(String str, int idx, String newString)
    {
        if(idx==str.length()) //base case 
        {
            System.err.println(newString);
            return;
        }
        char currChar=str.charAt(idx);

        //if the currChar wants to arrive: call 1
        subsequences(str,idx+1,newString+currChar);

        //if the currChar does not want to arrive: call 2
        subsequences(str,idx+1,newString);

    }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str,0,"");
    }
}
