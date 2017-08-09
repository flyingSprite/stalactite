package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Order 17: Use RSA testing
 *
 * Created by Quesle on 10/08/2017.
 */
public class Order014UseRSATest {
    @Test
    public void test() {
        String privateFile = "/Users/Fernando/Develop/test/private.pem";
        String publicFile = "/Users/Fernando/Develop/test/public.pem";
//        Order014UseRSA.createKeyPairs(privateFile, publicFile);

        String text = "This is a RCA test 你好";
        String encrytoText = Order014UseRSA.encrypt(text, publicFile);
        // TK2Y19OHx9GLRDWx//d7nKjGC4/eJQfor7UPI+eJvqTX5G7RzEbwJHTvAGY7WTPZVGdAO23EqVvVdh8t9/n7bUIGwkamaWeDSeoCx3nZBL6r9+B9mfj1ttSyZbZqywNXp3btjFFBQGuRHBd9JBxuX1/xlpz8zQ42K+JKirxqyaU=
        System.out.println(encrytoText);

        String decryptText = Order014UseRSA.decrypt(encrytoText, privateFile);
        // This is a RCA test 你好
        System.out.println(decryptText);
    }
}
