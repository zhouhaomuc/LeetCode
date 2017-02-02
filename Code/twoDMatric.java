public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int i=0, width = matrix[0].length, j=width-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target){
                i++;
            }else j--;
        }
    return false;
    }