/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    int findMax(int low, int high, MountainArray mountainArr)
    {
        int middle = 0;
        int max = mountainArr.get(high - 1);
        while(low <= high)
        {
            middle = (low + high) / 2;
            if( mountainArr.get(middle) < mountainArr.get(middle + 1))
            {
                low = middle + 1;
            }
            else
            {
                high = middle-1;
            }
           
        }

        return low;
    }

    int first(int low, int high, MountainArray mountainArr, int target, int sign)
    {
        int first = -1;
        int middle = 0;

        while(low <= high && sign == 1)
        {
            middle = (high + low)/2;
            if(mountainArr.get(middle) < target)
            {
                low = middle + 1;   
            }
            else if(mountainArr.get(middle) == target)
            {
                first = middle;
                high = middle - 1;
            }
            else high = middle - 1;
        }

        while(low <= high && sign == -1)
        {
            middle = (high + low)/2;
            if(mountainArr.get(middle) > target)
            {
                low = middle + 1;   
            }
            else if(mountainArr.get(middle) == target)
            {
                first = middle;
                high = middle - 1;
            }
            else high = middle - 1;
        }      

        return first;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int maxElement = findMax(1, mountainArr.length()-2, mountainArr);

        int firstSub = first(0, maxElement, mountainArr, target, 1);
        // System.out.println(maxElement);
        if(firstSub == -1)
        {
            int secondSub =  first(maxElement, mountainArr.length()-1, mountainArr, target, -1);
            System.out.println(secondSub);
            return secondSub;
        }
        return firstSub;
        
    }
}