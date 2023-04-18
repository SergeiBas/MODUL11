public class NeParSpisok {
    public String delParNames(String names){
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
}
