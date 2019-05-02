package Test;

/**
 * Created by Fang on 2019/4/30 13:48
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String res = longestPalindrome("asccs");
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len<1){
            return s;
        }
        String res = null;
        int maxlen=0,L,R;
        for (int i =0;i<len;i++){
            L=R=i;
            String tempString=searchMaxSubstring(s,L,R);
            if(tempString.length()>maxlen){
                maxlen=tempString.length();
                res=tempString;
            }

            if(L!=len-1&&s.charAt(L)==s.charAt(R+1)){
                R++;
                String tempString2=searchMaxSubstring(s,L,R);
                if(tempString2.length()>maxlen){
                    maxlen=tempString2.length();
                    res=tempString2;
                }

            }


        }

        return res;
    }

    private static String searchMaxSubstring(String s, int l, int r) {
        while(l>0&&r<s.length()-1&&s.charAt(l-1)==s.charAt(r+1)){
            l--;r++;

        }

        return s.substring(l,r+1);

    }

}
