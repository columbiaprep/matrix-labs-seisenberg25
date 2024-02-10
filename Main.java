public class Main {
    public static void main(String[] args) {
        int[][] inputArr1 = {{1,2,3},{1,2,3}};
        int[][] inputArr2 = {{1,2},{1,2},{1,2}};
        Solutions sol = new Solutions();
        sol.print(sol.scale(inputArr1,2));
        sol.print((sol.multiply(inputArr1,inputArr2)));
    }
}
