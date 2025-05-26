import java.util.*;
public class Swappingtwonos {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int temp=list.get(1);
        list.set(1,list.get(3));
        list.set(3,temp);
        System.out.println(list);
    } 
}
