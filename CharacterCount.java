import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "hello";
        Map<Character, Integer> characterCountMap = countCharacters(inputString);
        System.out.println(characterCountMap);
    }

    public static Map<Character, Integer> countCharacters(String s) {
       
        Map<Character, Integer> charCountMap = new HashMap<>();
        
      
        for (char c : s.toCharArray()) {
           
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } 
           
            else {
                charCountMap.put(c, 1);
            }
        }
        
        return charCountMap;
    }
}