import java.util.*;
public class CreatingLinkedList {
    // public static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // public static Node Head;
    // public static Node Tail;
    // public void AddFirst(int data){
    //     Node newNode=new Node(data);
    //     if(Head==null){
    //         Head=Tail=newNode;
    //         return;
    //     }
    //     newNode.next=Head;
    //     Head=newNode;
    // }
    // public void AddLast(int data){
    //     Node newNode=new Node(data);
    //     if(Head==null){
    //         Head=Tail=newNode;
    //         return;
    //     }
    //     Tail.next=newNode;
    //     Tail=newNode;

    // }
    // public void Print(){
    //     if(Head==null){
    //         System.out.println("null");
    //         return;
    //     }
    //     Node temp=Head;
    //     while(temp!=null){
    //         System.out.print(temp.data+"=>");
    //         temp=temp.next;
    //     }
    //     System.out.println("null");

    // }
    // public static void main(String[] args) {
    //     CreatingLinkedList ll=new CreatingLinkedList();
    //     ll.AddFirst(2);
    //     ll.AddFirst(1);
    //     ll.AddLast(3);
    //     ll.AddLast(4);
    //     ll.Print();
    // }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static void AddFirst(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=Tail=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=Tail=newNode;
        }
        Tail.next=newNode;
        Tail=newNode;
    }
    public static void Add(int idx,int data){
        if(idx==0){
            AddFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=Head;
        int i=0;
        while (i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return;
    }
    public static void removeFirst(){
        Head=Head.next;

    }
    public static void removeLast(){
        Node temp=Head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void print(){
        if(Head==null){
            System.out.println("Empty Linked List");
            return;
        }
        Node temp=Head;
        while(temp!=null){
        System.out.print(temp.data+"=>");
        temp=temp.next;
        }
        System.out.println("null");
    }
    public static void size(){
        int count=0;
        Node temp=Head;
        if(Head==null){
            System.out.println("empty linked list");
            return;
        }
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        return;
    }
    public static boolean iterativeSearch(int key){
        if(Head==null){
            return false;
        }
        Node temp=Head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static boolean recursiveSearch(Node temp,int key){
        if(temp==null){
            return false;
        }
        if(temp.data==key){
            return true;
        }
        return recursiveSearch(temp.next,key);
    }
    public static void main(String[] args) {
        // CreatingLinkedList ll=new CreatingLinkedList();
        // ll.AddFirst(2);
        // ll.AddFirst(1);
        // ll.AddFirst(0);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.Add(3, 10);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // ll.size();
        // System.out.println(ll.iterativeSearch(100));
        // Node temp=Head;
        // System.out.println(recursiveSearch(temp, 100));
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.add(1, 3);
        list.removeFirst();
        list.size();
        System.out.println(list);
    }
}
