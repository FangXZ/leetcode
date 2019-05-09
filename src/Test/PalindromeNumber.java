package Test;

/**
 * Created by Fang on 2019/4/12 11:51
 */
public class PalindromeNumber {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        boolean flag=true;
        Integer num= x;
        char[] chars = num.toString().toCharArray();
        int i=0;
        int j=chars.length-1;
        while (i<j){
            if (chars[i]!=chars[j]){
                flag=false;
                break;
            }
        }
        return false;

    }

}
