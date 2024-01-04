//To Print all the unique subsequences of a string "aaa" (use the data structure HashSet to store the unique strings or elements) which works for the previous problem as well
import java.util.*;
public class IntermediateRec8
{
    public static void subsequences(String str, int idx, String newString, HashSet<String> set)
    {
        if(idx==str.length()) //base case 
        {
            if(set.contains(newString))
                return;
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);

        //if the currChar wants to arrive: call 1
        subsequences(str,idx+1,newString+currChar,set);

        //if the currChar does not want to arrive: call 2
        subsequences(str,idx+1,newString,set);

    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subsequences(str,0,"",set);
    }
}