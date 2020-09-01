package main.java.FunctionalInterfaceExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Sample {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    // Function Interface
    //public Supplier<Integer> sam = () -> Optional.of(this).map(Sample::getI).orElse(null);
    public Supplier<Integer> sam = () -> getI();

    // Consumer Interface
    public Consumer<Integer> consumer = num -> this.setI(num);

    // Function Interface
    public BiFunction<Integer, Integer, String> bif = (a, b) -> {Integer res = a+b; return res.toString();};

    // Custom Made Function Interface
    public TriFunction<Integer, Integer, Integer, Integer> trif = (a, b, c) -> a+b+c;

    // Predicate, BiPredicate, Consumer, BiConsumer
    public Predicate<String> pred = (str) -> str.equalsIgnoreCase("DJ");
}

public class Test {

    // Consumer
    private static Consumer<Sample> consumer = (samp) -> samp.setI(10);

    // Predicate
    /*private static Predicate<Boolean> pred(String str) {
        return str.equalsIgnoreCase("DJ");
    }*/

    public static void main(String args[]) {

        Sample sample = new Sample();
        Test.consumer.accept(sample);
        sample.consumer.accept(20);

        System.out.println(sample.sam.get());
        System.out.println(sample.bif.apply(5, 6));
        System.out.println(sample.trif.apply(5, 6, 7));

        Map<String, Integer> details = new HashMap<>();
        details.put("dj",27);
        details.put("adi",26);
        details.put("shashank",25);
        details.put("dhruv",24);

        // OrElseGet internally uses Supplier
        Optional.ofNullable(details).orElseGet(HashMap::new);

        //details.entrySet().stream().forEach();
    }
}