import java.util.*;
import java.util.stream.Collectors;

public class SortSpisZA {
    public void sortZA(String[] str){
        String result =  Arrays.stream(str)
                .map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
