class MatrixMultiplication{
    public static void main(String[] args){
        int[][] A={{1,2,3},{4,5,6}};
        int[][] B={{7,8},{9,10},{11,12}};

        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;
        int[][] result = new int[r1][r2];

        for(int i = 0; i< 5; i++){
            for(int k = 0; k<c1; k++){
                result[i][j] = A[i][k]*B[k][j];

            }
        }

        System.out.println("Resultant Matrix: ");
        for(int j = 0; j < c2; j++){
            for(int i = 0; i < r1; i++){
                System.out.println(result[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
