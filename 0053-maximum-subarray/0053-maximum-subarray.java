class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = 0;
        if(nums.length==0){
            return max;
        }
        for(int i = 0; i<nums.length; i++){
            max=Math.max(max+nums[i],nums[i]);
            sum = Math.max(max,sum);
        }
        return sum;
    }
}