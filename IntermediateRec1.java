//Tower of Hanoi : Only one transfered in 1 step and smaller disks are always kept on larger disks
//disks 1,2,3 are to be transfered from source to dest where disk 1 is the biggest disk
//Time Complexity: O(2^n) since there are two recursive calls 
import java.util.*;
public class IntermediateRec1
{
    public static void towerofHanoi(int n, String src, String helper, String dest)
    {
        if(n==1) //base case 
        {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofHanoi(n-1, src, dest, helper); /*to transfer disk1 from src to dest, first we have to shift disk2 
        and 3 (i.e, n-1 disks) to the helper which is done by transfering disk 3 to dest and disk 2 to helper and disk 3 back to 
        helper. Finally disk 1 can be now transfered from the source to dest*/
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerofHanoi(n-1, helper, src, dest); /*to transfer the disk 2 and 3(n-1 disks) from the helper to the dest using the source.
        shift disk 3 to the src and move disk 2 from helper to the dest and finally move disk 3 from src to dest*/

    }
    public static void main(String[] args) {
        int  n=3;
        towerofHanoi(n, "S", "H", "D");
    }
}
