import java.util.*;
public class maximumelement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(6);
        int max=Integer.MIN_VALUE;
        int maxi=0;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
            maxi=Math.max(max,list.get(i));
        }
        System.out.println(max+" "+maxi);
    }
}
