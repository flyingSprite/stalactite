package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Order 10: Improve Generate SHA for text
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order019ImproveGenerateSHATest {

    @Test
    public void test() {
        String text = "123456";

        String sha1 = Order019ImproveGenerateSHA.sha1(text);
        // 7c4a8d09ca3762af61e59520943dc26494f8941b
        System.out.println(sha1);

        String sha224 = Order019ImproveGenerateSHA.sha224(text);
        // f8cdb04495ded47615258f9dc6a3f4707fd2405434fefc3cbf4ef4e6
        System.out.println(sha224);

        String sha256 = Order019ImproveGenerateSHA.sha256(text);
        // 8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92
        System.out.println(sha256);

        String sha384 = Order019ImproveGenerateSHA.sha384(text);
        // 0a989ebc4a77b56a6e2bb7b19d995d185ce44090c13e2984b7ecc6d446d4b61ea9991b76a4c2f04b1b4d244841449454
        System.out.println(sha384);

        String sha512 = Order019ImproveGenerateSHA.sha512(text);
        // ba3253876aed6bc22d4a6ff53d8406c6ad864195ed144ab5c87621b6c233b548baeae6956df346ec8c17f5ea10f35ee3cbc514797ed7ddd3145464e2a0bab413
        System.out.println(sha512);

    }
}
