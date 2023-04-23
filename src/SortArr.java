import java.util.*;

public class SortArr {
    public String SortNumbers(String[] NumbersArr){
        String str = "";
        for (String item: NumbersArr) str += item + " ";
        String[] arrNum = str.replaceAll("[ ,.]","").split("");
        List<Integer> NumArr = new ArrayList<>();
        for (String item: arrNum) NumArr.add(Integer.parseInt(item));
        Collections.sort(NumArr);
        String string = "";
        for (int item: NumArr) string += item + " ";
        return string;
    }
}
