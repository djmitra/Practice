package main.java.FunctionalInterfaceExamples;

public interface TriFunction<S, U, V, R> {

    R apply(S s, U i, V v);
}