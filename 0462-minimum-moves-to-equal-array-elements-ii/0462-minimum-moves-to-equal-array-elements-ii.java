class Solution {
    public int minMoves2(int[] nums) {
        
        int p = 0;
        Arrays.sort(nums);
            for(int i = 0; i<nums.length; i++){
                p+=Math.abs(nums[nums.length/2]-nums[i]);
            }
            return p;
        }
        
    }