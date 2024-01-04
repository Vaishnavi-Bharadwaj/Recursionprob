//to print the fibonacci series till nth term
//Fibonacci series: if a,b,c are three integers then c=a+b (starts with 0 and 1)
public class Recursion4 {
    public static void printFib(int a, int b,int n)
    {
        if(n==0)
            return;
        int c=a+b;
        System.out.println(c);
        printFib(b,c,n-1);   
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;//to print the first seven terms
        printFib(a,b,n-2); //we pass n-2 since we have already printed a and b
    }
}
