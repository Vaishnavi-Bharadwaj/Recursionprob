//Print all permutations of a string (backtracking is used here)
//Time complexity: O(n!)
import java.util.*;
public class AdvancedRecursion1 {
    public static void printPerm(String str, String permutation)
    {
        if(str.length()==0) //base case: when all the characters are traversed 
        {
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1); //getting possibilities for other characters keeping one of the characters are curr. eg: b-->curr and ac and ca are obtained using this statement 
            printPerm(newString, permutation+curr); //curr character is added to the string permutation and the function call for the next level is given

        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPerm(str,"");
    }
}
