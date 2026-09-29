package corejava.day29september2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public Character firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        //linkedhashmap always preserv the order
        for(char ch: str.toCharArray()){//str.toCharArray will convert like {'s','w','i','s','s'} if str is "swiss"
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        //till above character assigned with it frequencies
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
