import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddList {
    public void oddList(List<String> str){
        String result = IntStream.range(0, str.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + str.get(i))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
