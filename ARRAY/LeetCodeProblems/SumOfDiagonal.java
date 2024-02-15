package LeetCodeProblems;

public class SumOfDiagonal {
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                if (r == c) {
                    sum += array[r][c];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
       int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(sumDiagonalElements(myArray2D));
    }
}
