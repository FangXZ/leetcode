package Test;

import java.util.Hashtable;

/**
 * Created by Fang on 2019/4/12 12:03
 */
public class LongestSubstring {
    public static void main(String[] args) {
        int fang = lengthOfLongestSubstring("fang");
        System.out.println(fang);
    }

    public static int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!ht.contains(c)) {
                ht.put(c, 1);
            }
        }

        return ht.size();


    }
}
