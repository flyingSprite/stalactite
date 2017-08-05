package com.duastone.stalactite.taskInventory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Order 10: Generate SHA1 & SHA256 for text
 * Using utf-8 encode.
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order010GenerateSHA {


    public static String generateSha1(String text) {
        try {
            MessageDigest md5Digest = MessageDigest.getInstance("SHA1");
            byte[] md5Bytes = md5Digest.digest(text.getBytes("utf-8"));
            return Order009GenerateMD5.bytesToString(md5Bytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return "";
        }
    }

    public static String generateSha256(String text) {
        try {
            MessageDigest md5Digest = MessageDigest.getInstance("SHA-256");
            byte[] md5Bytes = md5Digest.digest(text.getBytes("utf-8"));
            return Order009GenerateMD5.bytesToString(md5Bytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return "";
        }
    }
}
