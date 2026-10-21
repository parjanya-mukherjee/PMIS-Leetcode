class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0; int sumB = 0;
        for(int i : aliceSizes){
            sumA+=i;
        }
        for(int j : bobSizes){
            sumB+=j;
        }
        int diff = (sumA-sumB)/2;
        for(int i:aliceSizes){
            for(int j:bobSizes){
                if((i-j)==diff){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}