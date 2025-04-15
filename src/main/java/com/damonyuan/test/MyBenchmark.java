package com.damonyuan.test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class MyBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void testMethod(Blackhole blackhole) {
        // Code to benchmark
        blackhole.consume("result");
    }

    // Optional: Run via main method
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

}
