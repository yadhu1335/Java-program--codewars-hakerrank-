import java.util.Map;
/*
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger{
    public static void main(String[] args){

        String s = "XX";

        Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int curVal = romans.get(s.charAt(i));
            if (i+1<s.length() && curVal<romans.get(s.charAt(i+1)))
                res -= curVal;
            else
                res += curVal;
        }
        System.out.printf("Decimal: %d",res);
    }
}