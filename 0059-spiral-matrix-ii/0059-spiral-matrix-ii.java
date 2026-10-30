class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;
        int total = n * n;

        while (num <= total) {
            // 1. Traverse Right across the top boundary
            for (int col = left; col <= right; col++) {
                matrix[top][col] = num++;
            }
            top++;

            // 2. Traverse Down along the right boundary
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = num++;
            }
            right--;

            // 3. Traverse Left across the bottom boundary
            for (int col = right; col >= left; col--) {
                matrix[bottom][col] = num++;
            }
            bottom--;

            // 4. Traverse Up along the left boundary
            for (int row = bottom; row >= top; row--) {
                matrix[row][left] = num++;
            }
            left++;
        }

        return matrix;
    }
}