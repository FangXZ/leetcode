/**
 * Created by Fang on 2019/4/22 19:12
 */
public class Huya {
    public static void main(String[] args) {
        int value=128;

        Integer i01=value;

        int i02 =value;

        Integer i03= Integer.valueOf(value);

        Integer i04 = new Integer(value);

        System.out.print(i01==i02);
        System.out.print(i03==i04);
        System.out.print(i01==i03);
        System.out.print(i02==i03);

    }
}
