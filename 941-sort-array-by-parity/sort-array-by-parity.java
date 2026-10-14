class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int left=0;
        int right=1;

        while(right<=nums.length-1)
        {
            if(nums[left]%2==0)
            {
                left++;
                right++;
            }

            else if(nums[right]%2==0)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
            }

            else{
                right++;
            }

        }

        return nums;
    }
}