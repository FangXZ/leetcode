package Test;

/**
 * Created by Fang on 2019/4/30 19:31
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int i = climbStairs(3);
        System.out.println(i);
    }

    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] temp = new int[n];
        temp[0] = 1;
        temp[1] = 2;

        for (int i = 2; i < n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];

        }

        return temp[n - 1];
    }
}
