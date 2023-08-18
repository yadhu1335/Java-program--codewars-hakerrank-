/*The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title 
of this kata. What's the use of saying "Eureka"? Because this sum gives the same number:
135=1+3*3+5*5*5
*/
//Program starts here
import java.util.List;
import java.util.*;
import java.io.*;

class Eureka {
    
    public static List<Long> sumDigPow(long a, long b) {
        // your code
      List<Long> answer=new ArrayList<Long>();
      long powerSum=0;
      for(long i=a;i<=b;i++){
        String StringA=String.valueOf(i);
        long digit=0;
        for(int j=0;j<StringA.length();j++){
          int num = Character.getNumericValue(StringA.charAt(j));
           digit+=Math.pow(num,j+1);
          }
        if(digit==i)
          answer.add(i);
      }
      return answer;
      }
  
