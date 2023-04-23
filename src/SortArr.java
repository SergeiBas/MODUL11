import java.util.*;
import java.util.stream.Collectors;

public class SortArr {
    public String SortNumbers(String[] NumbersArr){
        return Arrays.stream(NumbersArr)
                .map(item -> item.replaceAll("\\s+", "").split(","))
                .flatMap(item -> Arrays.stream(item))
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
