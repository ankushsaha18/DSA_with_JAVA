package DynamicPrograming.DP_1D;

public class HouseRobber {
    public static void main(String[] args) {
        int[] money = {2, 1, 4, 9};
        System.out.println(houseRobber(money));
    }
    public static int houseRobber(int[] money) {
        int n = money.length;
        int s1 = 0;
        int prev1 = 0;
        int prev2 = money[1];
        for(int i = 2 ; i < n ; i++){
            int f1 = money[i] + prev1;
            prev1 = prev2;
            prev2 = Math.max(f1,prev2);
        }
        s1 = prev2;
        prev1 = money[0];
        prev2 = Math.max(money[0],money[1]);
        for (int i = 2 ; i < n-1 ; i++){
            int f1 = money[i] + prev1;
            prev1 = prev2;
            prev2 = Math.max(f1,prev2);
        }
        return Math.max(s1,prev2);
    }
}
