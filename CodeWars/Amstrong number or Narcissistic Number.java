public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String strNumber = String.valueOf(number);
        char[] digits = strNumber.toCharArray();
        int sum = 0;
        for(char digit : digits)
          sum += Math.pow(Integer.parseInt(String.valueOf(digit)), digits.length);
        return sum == number ? true : false;
    }

}