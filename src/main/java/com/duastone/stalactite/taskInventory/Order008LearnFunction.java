package com.duastone.stalactite.taskInventory;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * Order 8: Learn Java 8 function
 * Created by Quesle on 05/08/2017.
 */
public class Order008LearnFunction {

    /**
     * Learn {@link Consumer}
     */
    public static void learn01Consumer() {
        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };

        for(int i = 0; i < 10; i ++) {
            consumer.accept(String.format("test %d", i));
        }
    }

    /**
     * Learn {@link BiConsumer}
     */
    public static void learn02BiConsumer() {
        BiConsumer<String, String> consumer = (key, value) -> {
            System.out.print(key + ":  ");
            System.out.println(value);
        };

        for(int i = 0; i < 10; i ++) {
            consumer.accept(String.format("test %d", i), String.format("This is a test! %d", i));
        }
    }

    /**
     * Learn {@link BiFunction}
     */
    public static void learn03BiFunction() {
        BiFunction<Integer, Integer, String> biFunction = (num1, num2) ->
            String.format("Result: %d", (num1 + num2));
        System.out.println(biFunction.apply(20,25));
    }

    /**
     * Learn {@link BiPredicate}
     */
    public static void learn04BiPredicate () {
        BiPredicate<Integer, String> condition = (i, s)-> i>20 && s.startsWith("R");

        System.out.println(condition.test(10,"Ram"));
        System.out.println(condition.test(30,"Shyam"));
        System.out.println(condition.test(30,"Ram"));
    }
}
