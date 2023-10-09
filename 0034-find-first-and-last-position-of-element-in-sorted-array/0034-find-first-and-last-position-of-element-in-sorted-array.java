class Solution {

    int first(int low, int high, int[] nums, int target)
    {
        int first = -1;
        int middle = 0;

        while(low <= high)
        {
            middle = (high + low)/2;
            if(nums[middle] < target)
            {
                low = middle + 1;   
            }
            else if(nums[middle] == target)
            {
                first = middle;
                high = middle - 1;
            }
            else high = middle - 1;
        }

        return first;
    }

    int last(int low, int high, int[] nums, int target)
    {
        int last = -1;
        int middle = 0;
        while(low <= high)  
        {
            middle = (high + low)/2;
            if(nums[middle] < target)
            {
                low = middle + 1;
            }
            else if(nums[middle] == target)
            {
                last = middle;
                low = middle + 1;
            }
            else high = middle - 1;
        }

        return last;
    }



    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 0)return new int[]{-1,-1};

        int firstIndex = first(0, nums.length - 1, nums, target);
        int lastIndex = last(0, nums.length - 1, nums, target);

        return new int[]{firstIndex, lastIndex};  

        
    }
}