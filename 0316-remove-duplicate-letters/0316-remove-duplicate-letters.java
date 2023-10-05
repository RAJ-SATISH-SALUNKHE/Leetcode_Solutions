import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        String str = "";
        Vector<Character> vector = new Vector<>();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            Integer count  = 0;
            Character chr = s.charAt(i);
            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(j) == chr)count++;
            }
            
            
            map.put(chr, count);
            count = 0;
        }
        
        vector.add('|');
        map.put('|', 10);
        for(int i = 0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            Integer count = map.get(c);
            map.put(c, count-1);
            
            if(vector.contains(c))continue;
            

            
            int top = vector.size()-1;
            while(c < vector.elementAt(top))
            {
                if(map.get(vector.elementAt(top)) != 0)
                {
                    vector.removeElementAt(top); 
                }
                else vector.add(c);
                
                if(vector.isEmpty())vector.add(c);
                top = vector.size()-1;
                
                
            }
            
            if(c > vector.elementAt(top) && !vector.contains(c))vector.add(c);
        }
            
    
        
        for(Character chr : vector)
        {
            str += chr;
        }

        return str;
    }
}