import java.util.*;

class Solution {
    public String reverseWords(String s) {

        boolean flag = false;
        Vector<String> vector = new Vector<>();
        String str = "";
        s = s + ' ';
        Integer length = s.length();

        for(int i = 0; i < length; i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(str.length() > 0)vector.add(str);
                str = "";
                continue;
            }
            else
            {
                str += s.charAt(i);
            }
        }

        Collections.reverse(vector);

        str = "";
        for(String x : vector)
        {
            str += x + ' ';
        }

        str = str.substring(0, str.length()-1);
        return str;
        
    }
}