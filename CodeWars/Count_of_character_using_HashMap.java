/*The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
What if the string is empty? Then the result should be empty object literal, {}.*/

//start of the program
import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
      Map<Character,Integer> characterCount=new HashMap<>();//initializing hashmap
      for(char c:str.toCharArray())//iterating through input and converting them to character array
        {
        characterCount.put(c,characterCount.getOrDefault(c,0)+1);//putting the character along with its repetation
        /*.getOrDefault(c,0)+1 allows you to retrieve the value associated with a given key
        from the map. If the key is not found in the map, it returns a default value that 
        you provide.+1 allows to add one if u find repetation*/
        
      }
        return characterCount;
    }
}
