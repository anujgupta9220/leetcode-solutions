class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int surrounding=0;
                int sum=0;
                sum=sum+img[i][j];
                surrounding++;
                // left check
                if(j!=0){
                    sum=sum+img[i][j-1];
                    surrounding++;
                }
                // top check
                if(i!=0){
                    sum=sum+img[i-1][j];
                    surrounding++;
                }
                // right check
                if(j!=n-1){
                    sum=sum+img[i][j+1];
                    surrounding++;
                }
                // bottom check
                if(i!=m-1){
                    sum=sum+img[i+1][j];
                    surrounding++;
                }
                // top left digonal check
                if(i!=0 && j!=0){
                    sum=sum+img[i-1][j-1];
                    surrounding++;
                }
                // top right digonal check
                if(i!=0 && j!=n-1){
                    sum=sum+img[i-1][j+1];
                    surrounding++;
                }
                // bottom left digonal check
                if(i!=m-1 && j!=0){
                    sum=sum+img[i+1][j-1];
                    surrounding++;
                }
                // bottom right digonal check
                if(i!=m-1 && j!=n-1){
                    sum=sum+img[i+1][j+1];
                    surrounding++;
                }
                sum=sum/surrounding;
                matrix[i][j]=sum;
                
            }
        }
        return matrix;
    }
}
