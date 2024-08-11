import com.sun.source.tree.Tree;

import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class TreeTraversal {

    static void preOrder(TreeNode root){

        if(root!=null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void inOrder(TreeNode root){

        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    static void postOrder(TreeNode root){

        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        preOrder(root);
        System.out.println("-------------------------------");
        inOrder(root);
        System.out.println("-------------------------------");
        postOrder(root);

    }
}
