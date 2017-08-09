package com.duastone.stalactite.taskInventory;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.crypto.digests.SHA224Digest;

import java.io.UnsupportedEncodingException;

/**
 * Order 19: Improve generate SHA for {@link Order010GenerateSHA}
 *
 * For those:
 * SHA-1
 * SHA-224
 * SHA-256
 * SHA-384
 * SHA-512
 *
 * http://www.bouncycastle.org/latest_releases.html
 *
 * Created by Quesle on 09/08/2017.
 */
public class Order019ImproveGenerateSHA {

    public static String sha1(String text) {
        try {
            return DigestUtils.sha1Hex(text.getBytes(CharEncoding.UTF_8));
        } catch (UnsupportedEncodingException e) {
            return DigestUtils.sha1Hex(text);
        }
    }

    public static String sha224(String text) {
        SHA224Digest sha224 = new SHA224Digest();
        sha224.update(text.getBytes(), 0, text.getBytes().length);
        byte[] bytes = new byte[sha224.getDigestSize()];
        sha224.doFinal(bytes, 0);
        return org.bouncycastle.util.encoders.Hex.toHexString(bytes);
    }

    public static String sha256(String text) {
        try {
            return DigestUtils.sha256Hex(text.getBytes(CharEncoding.UTF_8));
        } catch (UnsupportedEncodingException e) {
            return DigestUtils.sha256Hex(text);
        }
    }

    public static String sha384(String text) {
        try {
            return DigestUtils.sha384Hex(text.getBytes(CharEncoding.UTF_8));
        } catch (UnsupportedEncodingException e) {
            return DigestUtils.sha384Hex(text);
        }
    }

    public static String sha512(String text) {
        try {
            return DigestUtils.sha512Hex(text.getBytes(CharEncoding.UTF_8));
        } catch (UnsupportedEncodingException e) {
            return DigestUtils.sha512Hex(text);
        }
    }
}
