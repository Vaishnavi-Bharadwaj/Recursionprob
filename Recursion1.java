//When recursion occurs in the memory, all the function calls are stored in the form of a stack 
//if base case is not used, the memory will be full since every time recusive call is made, new memory is allocated and leads to stack overflow 
//To print numbers from 5 to 1 using recursion
public class Recursion1 {
    public static void printNum(int n)
    {
        if(n==0) //base case-->it should stop printing at 1
            return;
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNum(n);
    }
}
