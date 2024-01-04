//Move all 'x' to the end of the string
//Time complexity: O(n+count)=O(n+n) since count value is equal to n value=O(2n)=O(n) since we remove the constants 
import java.util.*;
public class IntermediateRec5
{
    public static void moveAllX(String str, int idx, int count, String newString)
    {
        if(idx==str.length()) //base case
        {
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='x')
        {
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else 
        {
            newString+=str.charAt(idx);
            moveAllX(str, idx+1, count, newString);
        }

        
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}