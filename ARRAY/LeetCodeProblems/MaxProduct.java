package LeetCodeProblems;



public class MaxProduct {
    public static String maxProduct(int[] intArray) {
        int max = 0;
        String Pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > max) {
                    max = intArray[i] * intArray[j];
                    Pairs = Integer.toString(intArray[i]) + ", " + Integer.toString(intArray[j]);
                }
            }
        }
        return Pairs;
    }

    public static void main(String[] args) {
        int[] intArray = { 10, 20, 30, 40, 50 };
       System.out.println( maxProduct(intArray));
    }
}
