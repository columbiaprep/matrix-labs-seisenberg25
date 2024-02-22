public class Main {
    public static void main(String[] args) {
        int[][] inputArr1 = {{1,2,3},{1,2,3}};
        int[][] inputArr2 = {{1,2},{1,2},{1,2}};
        int[][] inputArr3 = {{4,7},{4,2}};
        int[][] inputArr4 = {{4,7,10},{4,2,3},{1,8,6}};
        Solutions sol = new Solutions();
        sol.print(sol.scale(inputArr1,2));
        sol.print((sol.multiply(inputArr1,inputArr2)));
        System.out.println((sol.determinant(inputArr1)));
        System.out.println((sol.determinant(inputArr3)));
        System.out.println((sol.determinant(inputArr4)));
    }
}
