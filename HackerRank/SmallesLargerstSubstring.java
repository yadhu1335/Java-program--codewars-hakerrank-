/*Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s .
The second line contains an integer denoting k.*/
Sample Input 0
welcometojava
3
Sample Output 0
ava
wel
//Program starts here
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
     String smallest = s.substring(0, k);
     String largest = s.substring(0, k);

     for (int i = 0; i <= s.length() - k; i++) {
        String currentSubstr = s.substring(i, i + k);   
        if (currentSubstr.compareTo(smallest) < 0) {
            smallest = currentSubstr;
        }    
        if (currentSubstr.compareTo(largest) > 0) {
            largest = currentSubstr;
        }
    }
    return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
