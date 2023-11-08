import java.util.*;

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        int minTime = 0;

        if(fx == sx && fy == sy && t == 1)return false;

        int xDiff = Math.abs(fx-sx);
        int yDiff = Math.abs(fy-sy);

        int diagonal = Math.min(xDiff, yDiff);

        xDiff -= diagonal; yDiff -= diagonal;

        minTime = diagonal + xDiff + yDiff;


        return(minTime <= t);

        
    }
}