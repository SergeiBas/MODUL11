public class Main {
    public static void main(String[] args) {
        NeParSpisok neParSpisok = new NeParSpisok();
        SortSpisZA sortSpisZA = new SortSpisZA();
        SortArr sortArr = new SortArr();
        RandStrimNumb randStrimNumb = new RandStrimNumb();
        PeremishElStrim peremishElStrim = new PeremishElStrim();

        String str = "1. Ivan, 2. Sasha, 3. Peter, 4. Sergei, 5. Maxim, 11. Nemaxim, 7. Artur";
        String[] numarr = new String[]{"1, 2, 0", "4, 5"};
        sortSpisZA.sortZA(str);
    }
}