//Print keypad combination 
public class IntermediateRec9 {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String combination) //here combination is the newString 
    {   
        if(idx==str.length()) //base case 
        {
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0']; //to get the mapping of the key that is pressed   
        for(int i=0;i<mapping.length();i++)
        {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        printComb(str,0,"");
    }
}
