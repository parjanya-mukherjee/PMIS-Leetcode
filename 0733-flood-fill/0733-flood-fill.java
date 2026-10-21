class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ori = image[sr][sc];
        if (ori == color) return image;
        dfs(image, sr, sc, ori, color);
        return image;
    }
    public void dfs(int[][]image,int sr,int sc,int ori ,int color){
        if(sr < 0 || sr >= image.length ||sc < 0 || sc >= image[0].length ||image[sr][sc] != ori) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr - 1, sc, ori, color); 
        dfs(image, sr + 1, sc, ori, color); 
        dfs(image, sr, sc - 1, ori, color); 
        dfs(image, sr, sc + 1, ori, color);
    }
}