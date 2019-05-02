
import java.util.ArrayList;

import java.util.Scanner;

/**
 * Created by Fang on 2019/4/3 19:17
 */
public class Newarray {

    public static void main(String[] args) {
        ArrayList<Integer> res =new ArrayList<>();
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String line =null;

//        while (sc.hasNext()){
//            line = sc.nextLine();
//            String[] split = line.split(",");
//            ArrayList<Integer> tem = new ArrayList();
//            for (String s:split){
//                tem.add(Integer.parseInt(s));
//            }
//
//            ls.add(tem);
//        }
//        sc.close();

        while (!(line=sc.nextLine()).equals("")){

            String[] split = line.split(",");
            ArrayList<Integer> tem = new ArrayList();
            for (String s:split){
                tem.add(Integer.parseInt(s));
            }

            ls.add(tem);

        }

        //System.out.println(ls.toArray().toString());
        if (ls.get(0).size()>1) return;

        int len = ls.get(0).get(0);

        ls.remove(0);

        int templen = len;
        while(true){


            for (ArrayList<Integer> arr :ls) {
                //System.out.println(arr.toString());
                if (arr.size() >= templen) {
                    for (int i = 0; i < templen; i++) {
                        //System.out.println(arr.get(i));
                        res.add(arr.get(0));
                        arr.remove(0);
                    }
                    templen = len;
                } else {
                    templen = templen - arr.size();
                    if (arr.size()>0){
                        int arrs = arr.size();
                        for (int i = 0; i < arrs; i++) {
                            res.add(arr.get(0));
                            arr.remove(0);
                        }
                    }



                }

            }

            int Alen=0;
            for (ArrayList<Integer> a :ls){
                Alen+=a.size();
            }

            if (Alen==0){
                break;
            }
        }

        System.out.println(res.toString());


    }

}
