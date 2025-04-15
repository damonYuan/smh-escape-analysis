# READMD

## Preparation

The project is generated by

```
mvn archetype:generate \
  -DinteractiveMode=false \
  -DarchetypeGroupId=org.openjdk.jmh \   
  -DarchetypeArtifactId=jmh-java-benchmark-archetype \
  -DgroupId=com.damonyuan.test \
  -DartifactId=jmh-escape-analysis \
  -Dversion=1.0
```
## TODO

### [The Escape of ArrayList.iterator()](https://psy-lob-saw.blogspot.com/2014/12/the-escape-of-arraylistiterator.html)

### Check The Stream API compared with for loop

## Miscellaneous

- [JMH Unable to find the resource: /META-INF/BenchmarkList](https://stackoverflow.com/questions/38056899/jmh-unable-to-find-the-resource-meta-inf-benchmarklist)
- [Using JMH to Benchmark Multi-Threaded Code](https://psy-lob-saw.blogspot.com/2013/05/using-jmh-to-benchmark-multi-threaded.html)
- [Writing Java Micro Benchmarks with JMH: Juicy](https://psy-lob-saw.blogspot.com/2013/04/writing-java-micro-benchmarks-with-jmh.html)
- [JMH perfasm explained: Looking at False Sharing on Conditional Inlining](https://psy-lob-saw.blogspot.com/2015/07/jmh-perfasm.html)
- [The JVM Write Barrier - Card Marking](https://psy-lob-saw.blogspot.com/2014/10/the-jvm-write-barrier-card-marking.html)
- [Java Concurrent Counters By Numbers](https://psy-lob-saw.blogspot.com/2013/06/java-concurrent-counters-by-numbers.html)
- [Experimentation Notes: Java Print Assembly](https://psy-lob-saw.blogspot.com/2013/01/java-print-assembly.html)