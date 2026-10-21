class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = timeSeries.length * duration;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            totalTime -= Math.max(
                0,
                timeSeries[i] + duration - timeSeries[i + 1]
            );
        }

        return totalTime;
    }
}