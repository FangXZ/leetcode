package Test;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag=0;
        int temp1=0;
        int temp2=0;
        int val =0;

        ListNode ln=new ListNode(0);
        ListNode head=ln;
       if (l1==null&&l2==null){
           return null;
       }

        while (l1!=null||l2!=null||flag==1){
            if (l1!=null){
                temp1=l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                temp2=l2.val;
                l2=l2.next;
            }
            if (temp1+temp2+flag>9){
                val=temp1+temp2+flag-10;
                flag=1;
            }else {
                val=temp1+temp2+flag;
                flag=0;
            }
            temp1=0;
            temp2=0;
            ListNode lnt=new ListNode(val);
            ln.next=lnt;
            ln=lnt;


        }
        if (head.val==0){
            head=head.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}