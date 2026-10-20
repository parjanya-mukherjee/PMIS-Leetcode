class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;

        int i = 0;

        for (int j = 1; j <= nums.length; j++) {

            // break in sequence OR end of array
            if (j == nums.length || nums[j] != nums[j - 1] + 1) {

                if (i == j - 1) {
                    // single number
                    result.add(String.valueOf(nums[i]));
                } else {
                    // range
                    result.add(nums[i] + "->" + nums[j - 1]);
                }

                i = j;   // move start to next range
            }
        }

        return result;
    }
}
