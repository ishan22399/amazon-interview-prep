public class Q1_Two_Sum_1 {

    public static int[] twoSumBruteForce(int[] nums, int sum){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == sum){
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumBruteForce(nums, target);
        if(result[0] != -1){
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}