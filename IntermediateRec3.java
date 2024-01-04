//Find the first and the last occurrance of an element in string
//Time Complexity: O(n) where n is the length of the string that was traveresed once 
import java.util.*;
public class IntermediateRec3 {
    //the variables first and last are not passed as parameters to the function since their value should not be changed for each comaprison
    public static int first=-1; 
    public static int last=-1;
    public static void findOccurrence(String str, int idx, char element)
    {
        if(idx==str.length()) //base case: when idx value becomes equal to the last character's index, the first and the last occurrence(idx value) is printed 
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr=str.charAt(idx);
        if(curr==element)
        {
            if(first==-1) //this condition checks if it is the first occurrence of the element
                first=idx;
            else
                last=idx; //if it is not the first occurrence
        }
        findOccurrence(str, idx+1, element); //for the next level
        
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurrence(str, 0, 'a'); //index value is 0 since it is checked from the beginning
    }
}