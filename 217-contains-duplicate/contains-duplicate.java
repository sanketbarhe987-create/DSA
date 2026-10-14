class Solution {
    public boolean containsDuplicate(int[] nums) {


        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }

        HashSet<Integer> set=new HashSet<>(list);


        boolean isFound=true;


        int len=list.size();
        int len2=set.size();

        if(len==len2)
        {
            isFound=false;
        }

        else
        {
            isFound=true;
        }

        return isFound;

    }
}