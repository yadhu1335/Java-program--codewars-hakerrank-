/*The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is "hello" and  is "java".

A has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java"*/

//Start of theprogram
import java.io.*;
import java.util.*;

public class String_introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        Solution obj = new Solution();
        System.out.println(obj.length(A,B));/*Since it is
         refferencing a static object we have to create a object of 4
        the class before calling length()*/ 
        if(A.compareTo(B)>0)
          System.out.println("Yes");
        else
           System.out.println("No");
        /*1.if (string1 > string2) it returns a positive value.
          2.if both the strings are equal lexicographically 
            i.e.(string1 == string2) it returns 0.
          3.if (string1 < string2) it returns a negative value.*/
          
        System.out.println(A.substring(0,1).toUpperCase() + 
         A.substring(1) +  " " + B.substring(0,1).toUpperCase()
         + B.substring(1));//subString(startingIndex,endingIndex);
    }
    public int length(String a,String b)
    {
        int sumOfLength=a.length()+b.length();
        return sumOfLength;
    }
}



