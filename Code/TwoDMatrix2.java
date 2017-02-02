public boolean searchMatrix(int[][] matrix, int target) {
        if((matrix.length < 1) || (matrix[0].length < 1)) return false;
        int i=matrix.length-1, j=0;
        while((i>=0) && (j<matrix[0].length)){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j]<target) j++;
            else i--;
        }
    return false;
    }