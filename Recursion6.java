//to print x^n (stack height=logn) -->logn reduces the memory space
//x^n-->x^(n/2)*x^(n/2) ...... if n is even
//x^n-->x^(n/2)*x^(n/2)*x ...... if n is odd
import java.util.*;
public class Recursion6 {
    public static int calcPower(int x,int n)
    {
        if(n==0)        //base case 1 
            return 1;
        if(x==0)        //base case 2
            return 0;
        //to check if n is even
        if(n%2==0)
            return calcPower(x,n/2)*calcPower(x,n/2);
        else
            return calcPower(x,n/2)*calcPower(x,n/2)*x; //for odd power eg:x^5 = x^2 * x^2 * x
    }
    public static void main(String[] args) {
        int x=2, n=5; //or input can be taken by the user as well
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
