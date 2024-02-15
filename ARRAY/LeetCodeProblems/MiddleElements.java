package LeetCodeProblems;

public class MiddleElements {
    public static int[] middle(int array[]){
        if(array.length <= 2){
            return new int[0];
        }
        int arr[] = new int[array.length-2];
        int index = 1;
        while(index < array.length-1){
            arr[index-1] = array[index];
            index++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        middle(myArray) ;
        for(int i = 0; i<middle(myArray).length;i++){
            System.out.print(middle(myArray)[i]+" ");
        }
       
    }
}