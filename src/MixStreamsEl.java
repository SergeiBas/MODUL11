import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MixStreamsEl {
    public static <T> Stream<T> MixStreamsEl(Stream<T> first, Stream<T> second) {
        List<T> arr = new ArrayList<>();
        Iterator<T> First = first.iterator();
        Iterator<T> Second = second.iterator();

        while (First.hasNext() && Second.hasNext()) {
            arr.add(First.next());
            arr.add(Second.next());
        }
        return arr.stream();
    }
}
