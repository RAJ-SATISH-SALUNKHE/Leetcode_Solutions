class Solution {
public:
    bool winnerOfGame(string colors) {
        // int a = 0;
        // int b = 0;
        int cnta = 0;
        int cntb = 0;
        int i = 1;
        int j = 1;

        while(i < colors.length()-1 && j < colors.length()-1)
        {
            if(i > colors.length()-1)continue;
            if(j > colors.length()-1)continue;

            if(colors[i-1] == 'A' && colors[i] == 'A' && colors[i+1] == 'A')
            {
                cnta++;
                i++;
                // continue;
                // flagA = true;
            }
            else i+=1;

            if(colors[j-1] == 'B' && colors[j] == 'B' && colors[j+1] == 'B')
            {
                cntb++;
                j++;
                // continue;
                // flagB = true;
            }
            else j+=1;
        } 
        


        if(cnta>cntb){
            return true;
        }
        return false;
        
    }
};