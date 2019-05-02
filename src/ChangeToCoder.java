
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Fang on 2019/4/14 10:12
 */
public class ChangeToCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int[][] a={};
        int row=0;
        while ((line=sc.nextLine())!="") {
            if (line.equals("")){
                break;
            }
            String[] s = line.split(" ");
            int len = s.length;
            int[] temp=new int[len];
            for (int i = 0; i < len; i++) {
                temp[i] = Integer.parseInt(s[i]);
            }
            if(a.length==0){
                a=new int[len][len];
            }
            a[row]=temp;
            row++;
        }
        sc.close();
        //int[][] change = a.clone();
        int[][] change=new int[row][row];
        for (int i=0;i<row;i++) {
            for (int j = 0; j < row; j++) {
                change[i][j]=a[i][j];

            }
        }
        //System.arraycopy(a, 0, change, 0, a.length);
        boolean ischange=false;
        int count=0;
        while (true){

            for (int i=0;i<row;i++){
                for (int j=0;j<row;j++){
                    if (a[i][j]==1){
                        Boolean flag= ischange(a,change,i,j,row);
                        if (flag){
                            a[i][j]=2;
                            ischange=true;
                        }
                    }

                }
            }
            for (int i=0;i<row;i++) {
                for (int j = 0; j < row; j++) {
                    change[i][j]=a[i][j];

                }
            }

            if (!ischange){
                break;
            }else {
                ischange=false;
            }
            count++;
        }
        System.out.println(count==0?-1:count);



    }

    private static Boolean ischange(int[][] a, int[][] change, int i, int j, int row) {
        if(i>0&&i<row-1&&j>0&&j<row-1){
            if(change[i-1][j]==2||change[i+1][j]==2||change[i][j-1]==2||change[i][j+1]==2) {
                return true;
            }
        }else if (i>0&&i<row-1&&j==0){
            if (change[i-1][j]==2||change[i+1][j]==2||change[i][j+1]==2){
                return true;
            }
        }else if (i>0&&i<row-1&&j==row-1){
            if(change[i-1][j]==2||change[i+1][j]==2||change[i][j-1]==2){
                return true;
            }
        }else if (j>0&&j<row-1&&i==0){
            if (change[i+1][j]==2||change[i][j-1]==2||change[i][j+1]==2){
                return true;
            }
        }else if (j>0&&j<row-1&&i==row-1){
            if (change[i-1][j]==2||change[i][j-1]==2||change[i][j+1]==2){
                return true;
            }
        }else if (i==0&&j==0){
            if(change[i][j+1]==2||change[i+1][j]==2){
                return true;
            }
        }else if (i==0&&j==row-1){
            if(change[i+1][j]==2||change[i][j-1]==2){
                return true;
            }
        }else if (i==row-1&&j==0){
            if(change[i-1][j]==2||change[i+1][j]==2){
                return true;
            }
        }else if (i==row-1&&j==row-1){
            if(change[i][j-1]==2||change[i-1][j]==2){
                return true;
            }
        }

        return false;

    }
}
