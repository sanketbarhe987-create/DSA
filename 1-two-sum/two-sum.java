class Solution {
    public int[] twoSum(int[] arr, int target) {

        int[] result=new int[2];
       

        for(int i=0;i<arr.length;i++)
        {
            int sum=target-arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==sum)
                {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }

        return result;
    }
}