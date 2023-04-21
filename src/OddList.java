import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddList {
    public String delOddNames(String names){
        String[] arrNames = names.split(",");
        int[] arrNumbers = new int[arrNames.length];
        String[] arrNamesSub = new String[arrNames.length];
        for (int i = 0; i < arrNames.length; i++) {
            arrNumbers[i] = Integer.parseInt(arrNames[i].replaceAll("[A-z, .]",""));
        }
        int count = 0;
        for (int i = 0; i < arrNames.length; i++) {
            if((arrNumbers[i]%2) == 1){
                arrNamesSub[count] = arrNames[i];
                count++;
            }
        }
        return String.valueOf(stringBuilder(arrNamesSub));
    }
    public StringBuilder stringBuilder(String[] arrNames){
        StringBuilder result = new StringBuilder("");
        for (String name: arrNames) {
            if(name == null) break;
            result.append(name);
            result.append(",");
        }
        return new StringBuilder(result.substring(0, (result.length() - 1)));
    }
    public void OddList(List<String> str){
        Map<Integer, String> namesMap = new HashMap<>();

        for (int i = 0; i < str.size(); i++) {
            namesMap.put(i, str.get(i));
        }

        Map<Integer, String> sortedNames = namesMap.entrySet().stream()
                .filter(n -> n.getKey() % 2 == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        String res = sortedNames.entrySet().stream()
                .map(n -> n.getKey() + ". " + n.getValue())
                .collect(Collectors.joining(", "));

        System.out.println(res);
    }
}
