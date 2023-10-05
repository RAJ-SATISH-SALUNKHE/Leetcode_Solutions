import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        boolean flag = true;

        for(int i = 0; i < word1.length(); i++)
        {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
            // map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0));
        }

        for(int i = 0; i < word2.length(); i++)
        {
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
            // map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0));
        }

        for(Character key : map2.keySet())
        {
            if(!map1.containsKey(key))return false;
        }
        
        List<Integer> freqList1 = new ArrayList<>(map1.values());
        List<Integer> freqList2 = new ArrayList<>(map2.values());

        // Sort the frequency lists
        Collections.sort(freqList1);
        Collections.sort(freqList2);

        if(!freqList1.equals(freqList2))flag = false;


        System.out.println(map1);
        System.out.println(map2);

        // if(map1.equals(map2) && word1.length() == word2.length())return true;
        if(word1.length() == word2.length() && flag == true)return true;
        return false;
        
    }
}