package LeetCodeProblems;

public class BestTwoScores {
    public static int[] findTopTwoScores(int[] array) {
     int firstMax = Integer.MIN_VALUE;
     int secondMax = Integer.MIN_VALUE;
     for(int score : array){
        if(score>firstMax){
            secondMax = firstMax;
            firstMax = score;
        }
        else if(score >secondMax && score<firstMax){
            secondMax = score;
        }
     }  
     return new int[]{firstMax,secondMax};
    }

    public static void main(String[] args) {
        int[] myArray = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
        findTopTwoScores(myArray);
        System.out.println(findTopTwoScores(myArray)[0]);
        System.out.println(findTopTwoScores(myArray)[1]);
    }

}
