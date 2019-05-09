/**
 * Created by Fang on 2019/4/9 12:05
 */
public class OrderNode {
    public static void main(String[] args) {


    }

    public Node sortNode(Node head) {
        if (head == null || head.next == null)  //链表为空或者仅有单个结点
            return head;

        Node index = null, end = null;

        index = head;

        while (index.next != end) {
            while (index.next != end) {
                if (index.value > index.next.value) {
                    int tmp = index.value;
                    index.value = index.next.value;
                    index.next.value = tmp;
                }
                index = index.next;
            }

            end = index;
            index = head;
        }
        return head;

    }

    public Node findMid(Node head){
        if (head==null||head.next==null){
            return head;
        }
        Node fastIndex=head,slowIndex=head;
        while (fastIndex.next.next!=null){
            fastIndex=fastIndex.next.next;
            slowIndex=slowIndex.next;
        }
        if(fastIndex.next==null){
            //说明节点个数是奇数
            return slowIndex;
        }else {
            //节点个数为偶数，无中间节点
            return null;
        }


    }

    public void reverseList(Node head){
        if (head==null||head.next==null){
            return;
        }
        Node pre=head;
        Node node=head.next;
        Node nexnode;

        while (node!=null){
            nexnode=node.next;
            node.next=pre;
            pre=node;
            node=nexnode;
      }

    }



}

class Node {
    int value;
    Node next;

    public void Node(int value) {
        this.value = value;
    }
}
