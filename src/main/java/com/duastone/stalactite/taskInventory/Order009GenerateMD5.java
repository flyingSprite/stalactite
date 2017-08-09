package com.duastone.stalactite.taskInventory;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Order 9: Generate MD5 for text
 * Using utf-8 encode.
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order009GenerateMD5 {
    private static char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    public static String bytesToString(byte[] bytes) {
        int j = bytes.length;
        char str[] = new char[j * 2];
        int k = 0;
        for (int i = 0; i < j; i++) {
            byte byte0 = bytes[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str).toLowerCase();
    }

    public static String generateMD5(String text) {
        try {
            MessageDigest md5Digest = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5Digest.digest(text.getBytes("utf-8"));
            return bytesToString(md5Bytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return "";
        }
    }

    public static String md5Hex(String text) {
        return DigestUtils.md5Hex(text);
    }
}
