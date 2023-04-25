import java.util.*;
import java.util.stream.Collectors;

public class SortArr {
    public String sortNumbers(String[] NumbersArr){
        String result = Arrays.stream(NumbersArr)
                .map(item -> item.replaceAll("\\s+", "").split(","))
                .flatMap(item -> Arrays.stream(item))
                .collect(Collectors.joining(", "));
        List<Integer> res1 = Arrays.asList(result.split(", ")).stream()
                .map(item -> Integer.parseInt(item))
                .sorted()
                .collect(Collectors.toList());
        return res1.toString();
    }
}
