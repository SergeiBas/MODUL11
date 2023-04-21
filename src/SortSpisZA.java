public class SortSpisZA {
    public String sortZA(String str){
        String strAfterAll = str;
        strAfterAll.replaceAll("[0-9,.a-z]","");
        String[] arrAfterAll = strAfterAll.split("");
        String strToUpperCase = str.toUpperCase();
        String[] arrWords = strToUpperCase.split(",");

        return "";
    }
}

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//// Сортировка списка в обратном порядке в Java
//class Main
//{
//    public static void main(String[] args)
//    {
//        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
//
//        Collections.sort(list);
//        Collections.reverse(list);
//
//        System.out.println(list);
//    }
//}
