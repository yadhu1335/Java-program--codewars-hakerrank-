/*Palindrome wrod return true else false*/
//Program starts here
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder SB=new StringBuilder();
       SB.append(A);
       SB=SB.reverse();
       if(SB.toString().equals(A))
          System.out.println("Yes");
        else
          System.out.println("No");
    }
}
/*StringBuilder is a class in Java that is used to create and manipulate mutable sequences of characters. Unlike the String class, 
which is immutable (its value cannot be changed after it's created), StringBuilder allows you to modify the contents of the sequence 
without creating a new object each time. This can help improve performance when you need to perform multiple string concatenation or
modifications.Some common methods of the StringBuilder class include
append(),
insert(),
delete(),
replace(), and more.
These methods allow you to manipulate the characters within the sequence easily.
Here's a basic example of using StringBuilder:
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Appends " World" to the end
sb.insert(5, ",");   // Inserts a comma after "Hello"
sb.delete(5, 6);     // Deletes the comma
sb.replace(6, 11, "Java"); // Replaces "World" with "Java"
String result = sb.toString(); // Converts the StringBuilder to a String*/



