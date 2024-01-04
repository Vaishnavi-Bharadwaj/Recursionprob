//Print all the subsets of a set of first n natural numbers 
//Time complexity: O(2^n) sincw there are 2 options for the elements i.e, the element gets added to the subset or does not get added  
import java.util.*;
public class AdvancedRecursion5 {
    public static void printSubsets(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset)
    {
        //base case: when all the elements have been encountered
        if(n==0)
        {
            printSubsets(subset);
            return;
        }
        //if the element gets added to the subset
        subset.add(n);
        findSubsets(n-1, subset);

        //if the element does not get added to the subset, we delete the element at every level
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(n,subset);
    }
}
