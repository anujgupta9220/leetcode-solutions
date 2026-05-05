class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n == original.length){
            int[][] matrix=new int[m][n];
            int row=0,col=0;
            for(int i=0;i<original.length;i++){
                if(col==n){
                    col=0;
                    row++;
                }
                matrix[row][col]=original[i];
                col++;
            }
            return matrix;
        }
        int[][] matricess={};
        return matricess;
    }
}
