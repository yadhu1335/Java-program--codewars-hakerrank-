/*On the first line, print an integer,n , denoting the number of tokens in string s (they do not need to be unique).
Next, print each of the n tokens on a new line in the same order as they appear in input string s.

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of 10 such tokens in string s
, and each token is printed in the same order in which it appears in string s .*/

//program starts her
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        Pattern p=Pattern.compile("[A-Za-z]+");
        Matcher match=p.matcher(s);
        Matcher mit=p.matcher(s);/*The reason i gave 2 matcher is that
        i want to find length and output once u find in 
        matches u cannot find it again. There may be a better way 
        but i didnt get it now and gpt was useless*/ 
        int count=0;
        while(match.find())
          count++;
        System.out.println(count); 
        while(mit.find()){
            System.out.println(mit.group());
        }
    }
    
}

