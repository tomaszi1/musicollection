package pl.idziak.mc.fun;

import com.google.common.base.Stopwatch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ConcurrencyTest {

    private int[] stream;

    @Before
    public void setUp() throws Exception {
//        stream = LongStream.range(1, 10_000_000);
        stream = new Random().ints(100_000_000, 0, 1000).toArray();
    }

    @Test
    public void test1() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();

        int[] ints = Arrays.stream(stream)
                .parallel()
                .unordered()
                .map(operand -> operand * 2)
                .toArray();

        stopwatch.stop();
        System.out.println(ints.length);
        System.out.println(stopwatch.elapsed().toMillis());
    }
}
