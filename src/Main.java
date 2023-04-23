import java.util.List;

public class Main {
    public static void main(String[] args) {
        OddList oddList = new OddList();
        SortSpisZA sortSpisZA = new SortSpisZA();
        SortArr sortArr = new SortArr();
        RandStreamNumb randStreamNumb = new RandStreamNumb();
        MixStreamsEl mixStreamsEl = new MixStreamsEl();

        String[] str =  new String[]{"Ivan", "Sasha", "Peter", "Sergei", "Maxim", "Nemaxim", "Artur"};
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};
        sortSpisZA.sortZA(str);
    }
}