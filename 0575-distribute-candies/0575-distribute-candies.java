class Solution {
    public int distributeCandies(int[] candyType) {
        int canOnlyEat = candyType.length/2;
        LinkedHashSet<Integer> countType = new LinkedHashSet<>();
        for(int candy : candyType){
            countType.add(candy);
        }
        if(countType.size()>=canOnlyEat){
            return canOnlyEat;

        }
        else{
            return countType.size();
        }
    }
}