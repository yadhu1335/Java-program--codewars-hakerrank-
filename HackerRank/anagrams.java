/*Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string a.
The second line contains a string b.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams*/
//Program starts
 static boolean isAnagram(String a, String b) {
         // Complete the function
         Solution obj=new Solution();
         a=a.toLowerCase();/*since a is string we can give b4 
         lowecase if it was char then it should be inside
          toLowerCase(char) */
         char[] A=a.toCharArray();
         A=obj.arr(A);
         b=b.toLowerCase();
         char[] B=b.toCharArray();
         B=obj.arr(B);
         if(a.length()!=b.length())
            return false;
         for(int i=0;i<a.length();i++)
         {
             if(A[i]!=B[i])
               return false;
         }
         return true;
    }
  public char[] arr(char[] a){
      char temp;
      for(int i=0;i<a.length;i++)
      {
          for(int j=i+1;j<a.length;j++)
          {
             if((int)a[i]>a[j])
               {temp=a[i];
               a[i]=a[j];
               a[j]=temp;}
          }
      }
      return a;
  }
