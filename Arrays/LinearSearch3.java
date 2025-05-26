import java.util.*;
public class LinearSearch3 {
    public static int findKey(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int key=23;
        int index=findKey(numbers, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("index of the key is "+index);
        }

    }
}
