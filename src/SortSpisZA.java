import java.util.*;

public class SortSpisZA {
    public void sortZA(String[] str){
        str = Arrays.stream(str).sorted(Collections.reverseOrder())
                .toArray(String[]::new);
        for (int i = 0; i < str.length; i++) str[i] = str[i].toUpperCase();
        System.out.println(Arrays.toString(str));
    }
}
