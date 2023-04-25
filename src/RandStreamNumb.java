import java.util.stream.Stream;

public class RandStreamNumb {
    public Stream<Long> randomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
