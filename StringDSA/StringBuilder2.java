import java.util.*;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(int i='a';i<='z';i++){
            sb.append((char)i+" ");
        }
        System.out.println(sb);

    }
}
