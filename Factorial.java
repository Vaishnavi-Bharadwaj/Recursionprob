//to print the factorial of a number
import java.util.*;
public class Factorial {
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int res=fact(num);
        System.out.println(res);

    }
}
