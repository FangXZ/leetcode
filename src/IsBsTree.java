


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer key) {
        this.key = key;
    }
}

public class IsBsTree {
    static boolean flag = true;
    static int last = Integer.MIN_VALUE;
    public static void main(String[] args) {

        Queue<Integer> q1 =new LinkedList<Integer>();
        Queue<TreeNode> q2 =new LinkedList<TreeNode>();
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();
        String[] split = Line.split(",");

        if(split.length<1) {
            return;
        }
        for (String s : split) {

            q1.add(Integer.parseInt(s));
        }

        TreeNode root= new TreeNode(q1.poll());
        q2.add(root);

        if(q1.size()>1){

            TreeNode nodel = new TreeNode(q1.poll());
            TreeNode noder = new TreeNode(q1.poll());
            TreeNode node =  q2.poll();
            node.left=nodel;
            node.right=noder;
            q2.add(nodel);
            q2.add(noder);

        }
        boolean bsTree = isBSTree(root);
        System.out.println(bsTree);

    }



    public static boolean isBSTree(TreeNode root) {
        if (root.left != null && flag)
            isBSTree(root.left);
        if (root.key < last)
            flag = false;
        last = root.key;
        if (root.right != null && flag)
            isBSTree(root.right);
        return flag;
    }
}