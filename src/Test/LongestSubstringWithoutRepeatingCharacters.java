package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Fang on 2019/5/1 19:31
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int len = lengthOfLongestSubstring("abba");
        System.out.println(len);
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len<2){
            return len;
        }
        HashMap<Character, Integer> resmap = new HashMap<Character, Integer>();
        int left=-1;
        int right=0;
        int maxSubLen=0;
        int tempLen=0;
        //resmap.put(s.charAt(0),0);
        while (right<len){

            if (!resmap.containsKey(s.charAt(right))){
                resmap.put(s.charAt(right),right);
                tempLen=right-left;
                if (maxSubLen<tempLen){
                    maxSubLen=tempLen;
                }
                right++;
            }else {
                left=resmap.get(s.charAt(right));
                Iterator<Map.Entry<Character, Integer>> it = resmap.entrySet().iterator();
                while (it.hasNext()){
                    if (it.next().getValue()<=left){
                        it.remove();
                    }

                }



            }

        }

        return maxSubLen;
    }

}
