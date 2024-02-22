
//QUESTION: Check if row == col == value.

package NormalQuestion;
import java.util.Arrays;
import java.util.Random;
public class problem1 {
    public static void main(String[] args) {
      int [][] arr = new int [3][3];
      // System.out.println("hello");
      int count = 0;
      Random random = new Random();
      for(int r=0; r<3 ;r++){
        for(int c = 0; c<arr[0].length; c++){ // use can use c<3 also;
          arr[r][c] = random.nextInt(3);  //input numbers of range 0,1,2 
        }
        System.out.println();
      }
          System.out.println(Arrays.deepToString(arr)); // for printing 2D Array

          for(int r = 0 ; r<3 ; r++){
              for(int c = 0; c<3 ; c++){
                if(r==c && arr[r][c] == r){
                  count++;
                }
              }
          }
          System.out.println("Count: "+count);
    }    
}
