

///**
// * Created by Fang on 2019/5/1 16:06
// */
//public class DecodeWays {
//    public static void main(String[] args) {
//        int i = numDecodings("10");
//        System.out.println(i);
//    }
//
//    public static int numDecodings(String s) {
//        int len = s.length();
//        if (len<1){
//            return 0;
//        }
//        if (s.equals("0")){
//            return 0;
//        }
//        if (len==1){
//            return 1;
//        }
//
//        int[] num=new int[len];
//        num[0]=1;
//        for (int i =1;i<len;i++){
//            if (s.charAt(i)==0){
//                if ((s.charAt(i-1)+s.charAt(i))<26){
//                    num[i]=num[i-1];
//                }else {
//                    num[i]=num[i-1];
//                }
//            }else {
//                if ((s.charAt(i-1)+s.charAt(i))<26){
//                    num[i]=num[i-1]+2;
//                }else {
//                    num[i]=num[i-1]+1;
//                }
//            }
//
//
//        }
//
//
//        return num[len-1];
//    }
//
//}
