import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddList {
    public void OddList(List<String> str){
        Map<Integer, String> namesAndKeys = new HashMap<>();
        for (int i = 0; i < str.size(); i++) namesAndKeys.put(i + 1, str.get(i));

        Map<Integer, String> sortedArr = namesAndKeys.entrySet().stream()
                .filter(n -> ((n.getKey() ) % 2)  == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        String result = sortedArr.entrySet().stream()
                .map(n -> n.getKey() + ". " + n.getValue())
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
