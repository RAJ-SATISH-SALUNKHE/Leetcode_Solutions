class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length; i++)
        {
            max = (candies[i] > max)?candies[i]:max;
        }

        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= max)list.add(true);
            else list.add(false);
        }

        return list;
        
    }
}