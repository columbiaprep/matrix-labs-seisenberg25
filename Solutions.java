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
        if(numberOfColumns1!=numberOfRows2){
            return null;
        }
        int[][] newArr = new int[numberOfRows1][numberOfColumns2];
        //for each row in new matrix
        for(int r = 0; r<newArr.length;r++){
            //for each column in new matrix
            for(int c = 0; c<newArr[r].length;c++){
                int sum = 0;
                for(int k = 0; k<numberOfColumns1; k++){
                    sum += input1[r][k] * input2[k][c];
                }
                newArr[r][c]=sum;
            }
        }
        return newArr;
    }
    public int det2(int[][] input){
        int det = 0;
        if(input.length!=2||input[0].length!=2){
            return det;
        }
        det = Math.abs(input[0][0]*input[1][1]-input[0][1]*input[1][0]);
        return det;
    }
    public int det3(int[][] input){
        int det = 0;
        if(input.length!=3||input[0].length!=3){
            return det;
        }
        det = Math.abs(input[0][0] * (input[1][1] * input[2][2] - input[1][2] * input[2][1]) - input[0][1] * (input[1][0] * input[2][2] - input[1][2] * input[2][0]) + input[0][2] * (input[1][0] * input[2][1] - input[1][1] * input[2][0]));
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
