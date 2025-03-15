package DynamicPrograming.DP_1D;

import java.util.Arrays;

public class MaxSumNonAdj {
    public static void main(String[] args) {
        int[] nums = {1, 7, 16, 8};
        System.out.println(nonAdjacent(nums));
    }
    public static int nonAdjacent(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return nums[0];
        }
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        for(int i = 2 ; i < n ; i++){
            int pick = nums[i] + prev2;
            int dpick = prev1;
            prev2 = prev1;
            prev1 = Math.max(pick,dpick);
        }
        return prev1;
    }
}
