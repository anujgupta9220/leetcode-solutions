class Solution {
    public int islandPerimeter(int[][] grid) {
        int row=grid.length-1;
        int col=grid[0].length-1;
        int total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int side=4;
                    // left side check
                    if(j!=0){
                        if(grid[i][j-1]==1){
                            side--;
                        }
                    }
                    
                    
                    // top side check
                    if(i!=0){
                        if(grid[i-1][j]==1){
                            side--;
                        }
                    }
                    
                    // right side check
                    if(j!=col){
                        if(grid[i][j+1]==1){
                            side--;
                        }
                    }
                    
                    // bottom side check 
                    if(i!=row){
                        if(grid[i+1][j]==1){
                            side--;
                        }
                    }
                    
                    total=total+side;
                }
            }
        }
        return total;
    }
}
