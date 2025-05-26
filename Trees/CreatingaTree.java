import java.util.*;
public class CreatingaTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }


    }
    static class buildtree{
        static int idx=-1;
        public static Node BuildTrees(int [] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node NewNode=new Node(nodes[idx]);
            NewNode.left=BuildTrees(nodes);
            NewNode.right=BuildTrees(nodes);
            return NewNode;
        }
    }
    public static void preorder(Node root){//root left right O(n)
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){// left right root O(n)
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(Node root){//left root right O(n)
        if (root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=count(root.left);
        int rightNodes=count(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int heights=Math.max(leftHeight, rightHeight)+1;
        return heights;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter=diameter(root.left);
        int rightDiameter=diameter(root.right);
        int diam=height(root.left)+height(root.right)+1;
        return Math.max(diam,Math.max(leftDiameter,rightDiameter));
        }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree Tree=new buildtree();
        Node root=Tree.BuildTrees(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
    }
}
