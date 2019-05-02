package Test;

/**
 * Created by Fang on 2019/4/12 11:12
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        Integer num = x;
        char[] chars = num.toString().toCharArray();

        int i=0;
        if(num<0){
            //chars[0]="0".charAt(0);
            i=1;
        }
        int j=chars.length-1;
        char temp;
        while (i<j){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        String s = String.valueOf(chars);
        Long parseInt = Long.parseLong(s);
        int b = parseInt.intValue();
        return b;

    }
}
