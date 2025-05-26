import java.util.*;
public class CreatingArrayList {
    public static void main(String[] args) {
        //this is how we create a arraylist
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Float> list2=new ArrayList<>();
        //opreations in arrayList
        //// 1. Add a element Timecomplexity O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // //// To add a element at a selected index timexcomplexity O(n)
        // list.add(2,100);
        // System.out.println(list);
        // //// 2. get element Timecomplexity O(1)
        // int ele=list.get(3);
        // System.out.println(ele);
        // //// 3. remove element TImecomplexity O(n)
        // list.remove(2);
        //  System.out.println(list);
        // //// 4. set element Timecomplexity O(n)
        // list.set(2,10);
        // System.out.println(list);
        // //// 5. contains element or not Timecomplexity O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        //// 6. list size 
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
