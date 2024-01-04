//To print numbers from 1 to 5 using recursion
public class Recursion2
{
    public static void printNum(int num)
    {
        if(num>5) //base case-->it should stop printing at 5
            return;
        System.out.println(num);
        printNum(num+1);
    }
    public static void main(String[] args) {
        int num=1;
        printNum(num);
    }
}