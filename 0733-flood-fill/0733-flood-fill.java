class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcolor = image[sr][sc];

        if (orgcolor == color) {
            return image;
        }

        dfs(image, sr, sc, orgcolor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int orgcolor, int color) {
        // Check boundaries and original color
        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length ||
            image[r][c] != orgcolor) {
            return;
        }

        // Change the current pixel
        image[r][c] = color;

        // Visit all four neighboring pixels
        dfs(image, r - 1, c, orgcolor, color); // Up
        dfs(image, r + 1, c, orgcolor, color); // Down
        dfs(image, r, c - 1, orgcolor, color); // Left
        dfs(image, r, c + 1, orgcolor, color); // Right
    }
}