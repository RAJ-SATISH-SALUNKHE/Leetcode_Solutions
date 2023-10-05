class Solution {
    public String mergeAlternately(String word1, String word2) {

        String result = "";

        StringBuilder s1 = new StringBuilder(word1);
        StringBuilder s2 = new StringBuilder(word2);

        // int i = 0;
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            if(!s1.isEmpty())result += s1.charAt(0);
            if(!s2.isEmpty())result += s2.charAt(0);
            if(!s1.isEmpty())s1.deleteCharAt(0);
            if(!s2.isEmpty())s2.deleteCharAt(0);
        }

        return result;
        
    }
}