/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

class Solution {

    public HashMap<Integer, Integer> map = new HashMap<>();

    public void Traverse(TreeNode root)
    {
        if(root == null)return;

        Traverse(root.right);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        Traverse(root.left);

    }

    ArrayList<Integer> findMode(HashMap<Integer, Integer> map)
    {
        Integer maxFreq = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(Integer key : map.keySet())
        {
            Integer value = map.get(key);
            if(value > maxFreq)
            {
                maxFreq = value;
                list.clear();
                list.add(key);
            }
            else if(value == maxFreq)
            {
                list.add(key);
            }
        }

        return list;
    }


    public int[] findMode(TreeNode root) {

        ArrayList<Integer> myList = new ArrayList<>();

        Traverse(root);

        System.out.println(map);

        myList = findMode(map);

        int[] result = new int[myList.size()];

        for(int i = 0; i < myList.size(); i++)
        {
            result[i] = myList.get(i);
        }

        return result;
  
    }
}