/*Input Format

The first line of input contains an integer n, denoting the number of test cases. The next n lines contain a string of any printable 
characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Sample Output

Valid
Invalid
Invalid*/
//program starts here
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            boolean valid=true;
          	//Write your code
            try{
              Pattern.compile(pattern);
              //Matcher mat=pat.matcher(pat);
              }
             catch(Exception err){
                //  System.out.println("Invalid");
                 valid=false;
             } 
            //  System.out.println("Valid");
            if(valid==true)
              System.out.println("Valid");
            else  
                System.out.println("Invalid");

             testCases--;
		}
	}
}



