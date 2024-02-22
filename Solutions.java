public class Solutions {
    public Solutions() {}

    public int[][] scale(int[][] input, int scalingFactor){
        //create a new 2d array called output w/ row/col count the same
        int[][] newArr = new int[input.length][input[0].length];
        //iterate through input array
        for(int r = 0; r<input.length; r++){
            for(int c = 0; c < input[r].length; c++){
                //for each value, multiply by the scaling factor
                //place that value in the output array in the same spot
                newArr[r][c]=input[r][c]*scalingFactor;
            }
        }
        return newArr;
    }
    public int[][] multiply(int[][] input1, int[][] input2){
        int numberOfRows1 = input1.length;
        int numberOfColumns1 = input1[0].length;
        int numberOfRows2 = input2.length;
        int numberOfColumns2 = input2[0].length;
        // according to matrix rules, if the columns for the first matrix and rows for the second are not the same, it does not work
        if(numberOfColumns1!=numberOfRows2){
            return null;
        }
        int[][] newArr = new int[numberOfRows1][numberOfColumns2];
        //for each row in new matrix
        for(int r = 0; r<newArr.length;r++){
            //for each column in new matrix
            for(int c = 0; c<newArr[r].length;c++){
                int sum = 0;
                // for number of columns in matrix1 or rows in matrix2
                for(int k = 0; k<numberOfColumns1; k++){
                    // multiply input1 part row part column by input2 part row part column
                    sum += input1[r][k] * input2[k][c];
                }
                // set new array part row part column equal to the sum
                newArr[r][c]=sum;
            }
        }
        return newArr;
    }
    public int determinant(int[][] input){
        int det = 0;
        //  if the matrix is 3*3, use det formula for 3*3 matrices
        if(input.length==3&&input[0].length==3){
            det = Math.abs(input[0][0] * (input[1][1] * input[2][2] - input[1][2] * input[2][1]) - input[0][1] * (input[1][0] * input[2][2] - input[1][2] * input[2][0]) + input[0][2] * (input[1][0] * input[2][1] - input[1][1] * input[2][0]));
        }
        //  if the matrix is 2*2, use det formula for 2*2 matrices
        if(input.length==2&&input[0].length==2){
            det = Math.abs(input[0][0]*input[1][1]-input[0][1]*input[1][0]);
        }
        return det;

    }
    public void print(int[][] arr){
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
