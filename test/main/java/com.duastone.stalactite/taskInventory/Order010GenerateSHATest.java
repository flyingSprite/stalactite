package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Order 10: Generate SHA1 & SHA256 for text
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order010GenerateSHATest {

    @Test
    public void testSha1() {
        String sha1Text = Order010GenerateSHA.generateSha1("123456");
        // 7c4a8d09ca3762af61e59520943dc26494f8941b
        System.out.println(sha1Text);
        System.out.println(sha1Text.equals("7c4a8d09ca3762af61e59520943dc26494f8941b"));
    }

    @Test
    public void testSha256() {
        String sha256Text = Order010GenerateSHA.generateSha256("123456");
        // 8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92
        System.out.println(sha256Text);
        System.out.println(sha256Text.equals("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92"));
    }
}
