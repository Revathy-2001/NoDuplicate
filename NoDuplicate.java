
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);
    String sentence = kbd.nextLine();
    String dupArray[] =sentence.split(" ");
    String arr[] = removeDuplicates(dupArray);
    if(arr.length == dupArray.length)
      System.out.print("yes");
    else
      System.out.print("no");
    
    }
    public static String[] removeDuplicates(String []dupArray)
    {
        HashSet<String> mySet = new HashSet<String>(Arrays.asList(dupArray));
        dupArray = new String[mySet.size()];
        mySet.toArray(dupArray);
        return dupArray;
    }
}