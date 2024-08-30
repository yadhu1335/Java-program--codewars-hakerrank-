import java.util.Scanner;

public class Basics{
    public static void main(String[] args){
        Basics obj =new Basics();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int num = sc.nextInt();
        obj.oddEven(num);
        System.out.printf("Factorial: %d\n",obj.fact(num));
        System.out.printf("fib: %d\n",obj.fib(num));
        sc.nextLine();

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.printf("Is it a palindrome? %b\n",obj.isPalindrome(str));
        obj.palindrome2(str);

        sc.close();
    }
    public void oddEven(int num) {
        if(num%2 == 0)          
             System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public long fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num-1);
    }
    public int fib(int num) {
        if(num==0)
            return 0;
            if(num==1)
            return 1;
        return fib(num-1) + fib(num-2);
    }

    public boolean isPalindrome(String str) {
        String rev = "";
        for(int i= str.length()-1; i>=0; i--)
            rev += str.charAt(i);
        return str.equals(rev);
    }

    public void palindrome2(String str) {
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString()))
            System.out.println("pallindrome");
        else
            System.out.println("not palindrome");
    }
}