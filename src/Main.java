import java.util.*;

/**
 * Created by Fang on 2019/4/13 19:36
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        String line;
        while ((line=sc.nextLine())!=""){
            String[] s = line.split(" ");
            arr1.add(Integer.parseInt(s[0]));
            arr2.add(Integer.parseInt(s[1]));

        }

        sc.close();
        Integer nodenum = arr1.get(0);
        Integer edgeNum = arr2.get(0);
        HashMap<Integer,Integer> deg = new HashMap<>();
        for (int i=0;i<nodenum;i++){
           deg.put(i,0);
        }

        for(int i=1;i<arr2.size();i++){
            Integer rudu = deg.get(arr2.get(i));
            deg.put(arr2.get(i),rudu++);
        }
        Collection<Integer> values = deg.values();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (Integer Inte:values){
            arr3.add(Inte);
        }
        Collections.sort(arr3);
        int count=1;
        int[] res={};
        for (Integer i :arr3){
            for (Map.Entry entry:deg.entrySet()){
                if (entry.getValue()==i){

                    res[Integer.parseInt(entry.getKey().toString())]=count;
                    count++;
                    break;
                }



            }

        }

        System.out.println(res.toString());

    }






















    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char[] chars = s.toCharArray();
//        int count=0;
//        int j=0;
//        for(int i=0;i<chars.length;i++){
//            if (chars[i]==1){
//                count++;
//            }else {
//                j=i;
//                break;
//            }
//        }
//        for (int i=chars.length-1;i>j;j--){
//            if (chars[j]==1){
//                count++;
//            }else {
//
//                break;
//            }
//        }
//
//        System.out.println(count);
//    }
}
