public class Solutions {
    int[][] inputArray;

    public Solutions(int[][] inputArray) {
        this.inputArray = inputArray;
    }

    public int[][] getInputArray() {return inputArray;}

    public void setInputArray(int[][] inputArray) {this.inputArray = inputArray;}

    public int[][] scale(int[][] input, int scalingFactor){
        //create a new 2d array called output w/ row/col count the same
        int[][] newArr = new int[input[0].length][input.length];
        //iterate through input array
        for(int r = 0; r<input.length; r++)
        //for each value, multiply by the scaling factor
        //place that value in the output array in the same spot
        //return newArr
    }
}
