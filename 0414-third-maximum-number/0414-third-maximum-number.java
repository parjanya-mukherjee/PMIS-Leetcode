class Solution {
    public int thirdMax(int[] nums) {
        java.util.Arrays.sort(nums);
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++){
            numbers.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(numbers);
        if(list.size() == 1){
            return list.get(0);

        }
        else if(list.size() == 2){
            return list.get(1);
        }
        else {
            return list.get(list.size()-3);
        }
    }
}