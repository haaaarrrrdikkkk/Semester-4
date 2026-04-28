class MatrixSubtraction{
    public static void main(String[] args){
        int[][] A = {{5,8,6},{3,2,1}};
        int[][] B = {{1,2,3},{4,5,6}};

        int rows=A.length;
        int cols=A[0].length;

        int[][] result = new int[rows][cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j< cols; j++){

            result[i][j] = A[i][j] - B[i][j];
        }
    }
    System.out.println("Resultant Matrix:");
    for(int i =0; i < rows; i++){
        for(int j = 0; j<cols; j++){
            System.out.println(result[i][j]+" ");

        }
        System.out.println();

    }
  }
}