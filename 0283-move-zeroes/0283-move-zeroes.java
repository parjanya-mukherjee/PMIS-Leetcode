class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] != 0) {
                arr[j] = nums[i];
                j++;
            }
            i++;
        }

        while (j < nums.length) {
            arr[j] = 0;
            j++;
        }

        for (int k = 0; k < nums.length; k++) {
            nums[k] = arr[k];
        }
    }
}