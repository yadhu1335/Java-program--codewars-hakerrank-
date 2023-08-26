/*You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered
valid if all the following constraints are satisfied:

The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or 30 greater than  characters, then it 
is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting
of lowercase characters [a-z],[A-z] uppercase characters , [0-9]and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].
Input Format

The first line of input contains an integer n, describing the total number of usernames. Each of the next n lines contains a string 
describing the username. The locked stub code reads the inputs and validates the username.
For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0:
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output 0:
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid*/

//program starts here
import java.util.Scanner;
class UsernameValidator {
    
    public static final String regularExpression =
                      "^[A-Za-z][a-zA-Z\\d_]{7,29}" ;
    /*Explanation of regex
      ^[A-Za-z]=First we check if the STARTING is an alphabet
      [a-zA-Z\\d_]=after checking FIRST letter is alphabet we check if the remaining contains alphabets,letters and _ 
      {7,29}=It is specifies in the question that <8 & >30 is invalid*/
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
