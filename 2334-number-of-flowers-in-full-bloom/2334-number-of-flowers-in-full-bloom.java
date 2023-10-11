
// import java.util.*;

// class Solution {

//     int binarySearchStart(int low, int high, int target, int[] start)
//     {
//         int middle = 0;
//         int val = 0;
//         while(low <= high)
//         {
//             if(low == high);
//             middle = (high + low) / 2;
//             if(start[middle] > target)
//             {
//                 val = middle;
//                 high = middle - 1;
//             }
//             else
//             {
//                 low = middle + 1;
//             }
//         }

//         return val;
//     }

//     int binarySearchEnd(int low, int high, int target, int[] end)
//     {


//         int middle = 0;
//         int val = 0;
//         while(low <= high)
//         {
//             middle = (high + low) / 2;
//             if(end[middle] >= target)
//             {
//                 val = middle;
//                 high = middle - 1;
//             }
//             else
//             {

//                 low = middle + 1;
//             }
//         }

//         return val;
//     }

//     public int[] fullBloomFlowers(int[][] flowers, int[] people) {
//         int[] result = new int[people.length];

//         int[] column1 = new int[flowers.length];
//         int[] column2 = new int[flowers.length];

//         for (int row = 0; row < flowers.length; row++) {
//             column1[row] = flowers[row][0]; // Values from the first column
//             column2[row] = flowers[row][1]; // Values from the second column
//         }

//         Arrays.sort(column1);
//         Arrays.sort(column2);
//         for(int i = 0; i < people.length; i++)
//         {
//             result[i] = Math.abs(binarySearchStart(0, column1.length - 1, people[i], column1) - binarySearchEnd(0, column2.length - 1, people[i], column2));
//         }

//         return result;

//     }
// }


import java.util.*;

class Solution {

    int binarySearchStart(int target, int[] start)
    {
    	int low = 0;
    	int high = start.length-1;
        int middle = 0;
        int val = start.length;
        while(low <= high)
        {
            middle = (high + low) / 2;
            if(start[middle] > target)
            {
                val=middle;
                high=middle-1;
            }
            else
            {
                low = middle + 1;
            }
        }

        return val;
    }

    int binarySearchEnd(int target, int[] end)
    {
    	int low = 0;
    	int high = end.length-1;

        int middle = 0;
        int val = end.length;
        while(low <= high)
        {
            middle = (high + low) / 2;
            if(end[middle] >= target)
            {
                val = middle;
                high = middle - 1;
            }
            else
            {
                low = middle + 1;
            }
        }

        return val;
    }

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] result = new int[people.length];

        int[] column1 = new int[flowers.length];
        int[] column2 = new int[flowers.length];

        for (int row = 0; row < flowers.length; row++) {
            column1[row] = flowers[row][0]; // Values from the first column
            column2[row] = flowers[row][1]; // Values from the second column
        }

        Arrays.sort(column1);
        Arrays.sort(column2);
        for(int i = 0; i < people.length; i++)
        {
            result[i] = Math.abs(binarySearchStart(people[i], column1) - binarySearchEnd(people[i], column2));
        }

        return result;

    }
}