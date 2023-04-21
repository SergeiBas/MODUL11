import java.util.*;

public class SortSpisZA {
    public void sortZA(String str){
        String[] replaceAll = str.replaceAll("[0-9. ]","").toUpperCase().split(",");
        replaceAll = Arrays.stream(replaceAll).sorted(Collections.reverseOrder())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(replaceAll));
    }
}
