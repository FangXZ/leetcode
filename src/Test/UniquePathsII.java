package Test;

/**
 * Created by Fang on 2019/4/30 16:24
 */
public class UniquePathsII {
    public static void main(String[] args) {
        int[][] a={{0,0}};

        int i = uniquePathsWithObstacles(a);

        System.out.println(i);


    }
    public static int uniquePathsWithObstacles(int[][] a) {

        int m =a.length;
        int n = a[0].length;
        if(m<1){
            return 0;
        }

        int[][] res=new int[m][n];
        for (int i=0;i<m;i++){
            res[i][0]=1;
            if(a[i][0]==1){
                res[i][0]=0;
                break;
            }
        }
        for (int i=0;i<n;i++){
            res[0][i]=1;
            if(a[0][i]==1){
                res[0][i]=0;
                break;
            }
        }

        for (int i=1;i<m;i++){

            for (int j=1;j<n;j++){
                res[i][j]=res[i-1][j]+res[i][j-1];
                if (a[i][j]==1){
                    res[i][j]=0;
                }

            }

        }

        return res[m-1][n-1];
    }


}
