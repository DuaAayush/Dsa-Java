import java.util.*;
public class MaxWater {
    public static int maximumwater(ArrayList<Integer> height){
        int maxWat=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int water=ht*width;
                maxWat=Math.max(maxWat,water);
            }
        }
        return maxWat;
    }
    public static int maximumWaterTwoPointer(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int water=ht*width;
            maxWater=Math.max(maxWater,water);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maximumwater(height));
        System.out.println(maximumWaterTwoPointer(height));
    }
}
