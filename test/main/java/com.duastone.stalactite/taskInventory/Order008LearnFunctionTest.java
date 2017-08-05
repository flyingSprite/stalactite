package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Order 8: Learn Java 8 function
 * Created by Quesle on 05/08/2017.
 */
public class Order008LearnFunctionTest {

    @Test
    public void testLearn01Consumor() {
        Order008LearnFunction.learn01Consumer();
    }

    @Test
    public void testLearn02BiConsumor() {
        Order008LearnFunction.learn02BiConsumer();
    }

    @Test
    public void testLearn03BiFunction() {
        Order008LearnFunction.learn03BiFunction();
    }

    @Test
    public void TestLearn04BiPredicate() {
        Order008LearnFunction.learn04BiPredicate();
    }


}
