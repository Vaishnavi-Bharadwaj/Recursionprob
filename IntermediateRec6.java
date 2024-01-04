//Remove duplicates in a string and return a new string without duplicates
//Time complexity:O(n) 
import java.util.*;
public class IntermediateRec6 {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString)
    {
        if(idx==str.length()) //base case: when the last character to be checked is encountered, return the newString
        {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a'])  //returns an integer and checks if it exits(true). If it is true the char is not added to the newString
        {
            removeDuplicates(str, idx+1, newString);
        }
        else //If the character is encountered for the first time, it is added to the newString
        {
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        String str="abbccda";
        removeDuplicates(str,0,"");
    }
}
