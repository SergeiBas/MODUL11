import java.util.*;

public class SortArr {
    public String SortNumbers(String[] NumbersArr){
        String str = "";
        for (String itme: NumbersArr) {
            str += itme + " ";
        }
        String[] arrNum = str.replaceAll("[ ,.]","").split("");
        List<Integer> NumArr = new ArrayList<>();
        for (String item: arrNum) {
            NumArr.add(Integer.parseInt(item));
        }
        Collections.sort(NumArr);
        String stroka = "";
        for (int item: NumArr) {
            stroka += item + " ";
        }
        return stroka;
    }
}
