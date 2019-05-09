package Test;

import static java.lang.Math.min;

/**
 * Created by Fang on 2019/4/30 19:08
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] a ={{1,3,1},{1,5,1},{4,2,1}};

        int i = minPathSum(a);
        System.out.println(i);

    }

    public static int minPathSum(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        if (m<1){
            return 0;
        }
        int[][] sum = new int[m][n];
        for (int i =0;i<m;i++){
            if (i==0){
                sum[0][0]=a[0][0];
            }else {
            sum[i][0]=a[i][0]+sum[i-1][0];
            }
        }
        for (int i =0;i<m;i++){
            if (i!=0) {
              sum[0][i]=a[0][i]+sum[0][i-1];
            }
        }


        for (int i =1 ;i<m;i++){
            for(int j=1;j<n;j++){

                sum[i][j]=min(sum[i-1][j],sum[i][j-1])+a[i][j];


            }

        }

        return sum[m-1][n-1];
    }
}
