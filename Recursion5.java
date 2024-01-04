//to print x^n (stack height=n)
import java.util.*;
public class Recursion5{
    public static int calcPower(int x,int n)
    {
        if(n==0)        //base case 1 
            return 1;
        if(x==0)        //base case 2
            return 0;
        int xPownm1=calcPower(x,n-1);
        int xPown=x*xPownm1; //xPown=x*calcPower(x,n-1);
        return xPown; //return x*calcPower(x,n-1);
        
    }
    public static void main(String[] args) {
        int x=2, n=5; //or input can be taken by the user as well
        int ans=calcPower(x,n);
        System.out.println(ans);
        
    }
}