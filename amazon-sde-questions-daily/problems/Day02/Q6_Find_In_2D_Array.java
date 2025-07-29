import java.util.*;

public class Q6_Find_In_2D_Array {
    static int[][] findNum(int[][] arr, int num){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j] == num){
                    return new int[][] { {i,j} };
                }
            }
        }

        return new int[][] {{-1, -1}};
    }


    static int[][] findWord(String[][] arr, String word){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j].equals(word)){
                    return new int[][] {{i, j}};
                }
            }
        }

        return new int[][] {{-1, -1}};
    }


    public static void main(String[] args) {


        int[][] numArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] numResult = findNum(numArray, 5);
        System.out.println("Number found at: " + Arrays.deepToString(numResult));

        String[][] wordArray = {
            {"hello", "world"},
            {"java", "programming"}
        };
        int[][] wordResult = findWord(wordArray, "java");
        System.out.println("Word found at: " + Arrays.deepToString(wordResult));
    }
}
