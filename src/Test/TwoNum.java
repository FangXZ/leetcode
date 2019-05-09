//package Test;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class Solution {
//    public static void main(String[] args) {
//       int[] a= {1,2};
//       int target= 3;
//        int[] ints = twoSum(a, target);
//
//
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] clone = nums.clone();
//
//        int[] res= {0,0};
//        Arrays.sort(clone);
//        if (clone.length<2){
//            return res;
//        }
//
//        int len = clone.length-1;
//        int start=0;
//        while(start<len){
//            if (clone[start]+clone[len]==target) {
//                int[] r=findindex(clone[start],clone[len],nums);
//
//
//                return r;
//            }else if (clone[start]+clone[len]<target){
//                start++;
//            }else {
//                len--;
//            }
//
//        }
//        return res;
//
//    }
//
//    public static int[] findindex(int i, int i1, int[] nums) {
//        int[] res={0,0};
//        Boolean flag = false;
//        for (int j=0;j<nums.length;j++){
//            if (nums[j]==i&&!flag){
//                flag=true;
//                res[0]=j;
//                continue;
//            }
//            if (nums[j]==i1){
//                res[1]=j;
//
//            }
//        }
//        return res;
//
//    }
//}