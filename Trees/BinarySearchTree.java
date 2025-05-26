import java.util.*;

import org.w3c.dom.ranges.Range;
public class BinarySearchTree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static Node CreateBST(int val, Node root){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=CreateBST(val, root.left);
        }
        else{
            root.right=CreateBST(val, root.right);
        }
        return root;
    }
    public static Node createBST2(int val,Node root){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=createBST2(val, root.left);
        }
        else{
            root.right=createBST2(val, root.right);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean SearchTree(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return SearchTree(root.left, key);
        }
        else {
            return SearchTree(root.right, key);
        }

    }
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            Node Is=SearchforSucessor(root.right);
                root.data=Is.data;
                root.right=delete(root.left,Is.data);
            
           
        }return root;
    }
    public static Node SearchforSucessor(Node Root){
        while(Root.left!=null){
            Root=Root.left;
        }
        return Root;
    }
    public static void Range(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            Range(root.left,k1,k2);
            System.out.println(root.data+" ");
            Range(root.right, k1, k2);
        }
        else if(root.data>=k2){
            Range(root.left,k1,k2);
        }
        else Range(root.right, k1, k2);
    }
    public static void main(String[] args) {
        int [] values={6,3,1,2,7,8,9,4,5,10};
        Node root=null;
        for (int i=0;i<values.length;i++){
            root=createBST2(values[i], root);
        }
        inorder(root);
        System.out.println();
        // if(SearchTree(root, 12)){
        //     System.out.println("Key Found");
        // }
        // else{
        //     System.out.println("Key not found");
        // }
        delete(root, 5);
        inorder(root);
        Range(root, 5, 12);
    }
}
