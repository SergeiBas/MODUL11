import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MixStreamsEl {
    public static <T> Stream<T> MixStreamsEl(Stream<T> first, Stream<T> second) {
        List<T> arr = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            arr.add(iteratorFirst.next());
            arr.add(iteratorSecond.next());
        }
        return arr.stream();
    }
}
