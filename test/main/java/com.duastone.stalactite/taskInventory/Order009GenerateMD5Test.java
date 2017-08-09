package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Order 9: Generate MD5 for text
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order009GenerateMD5Test {

    @Test
    public void test() {
        String text = "123456";

        String md5Text = Order009GenerateMD5.generateMD5(text);
        // e10adc3949ba59abbe56e057f20f883e
        System.out.println(md5Text);

        String md5Text2 = Order009GenerateMD5.md5Hex(text);
        // e10adc3949ba59abbe56e057f20f883e
        System.out.println(md5Text2);

        // true
        System.out.println(md5Text.equals(md5Text2));
    }
}
