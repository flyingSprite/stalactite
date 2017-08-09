package com.duastone.stalactite.taskInventory;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import javax.crypto.Cipher;
import java.io.File;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Order 14: Use RSA
 *
 * Created by Quesle on 10/08/2017.
 */
public class Order014UseRSA {

    public static void createKeyPairs(String privateFile, String publicFile) {
        try {
            Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA", "BC");
            generator.initialize(1024, new SecureRandom());
            KeyPair pair = generator.generateKeyPair();
            PublicKey pubKey = pair.getPublic();
            PrivateKey privKey = pair.getPrivate();
            byte[] pk = pubKey.getEncoded();
            byte[] privk = privKey.getEncoded();
            String strpk = new String(Base64.encodeBase64(pk));
            String strprivk = new String(Base64.encodeBase64(privk));
            FileUtils.write(new File(privateFile), strprivk);
            FileUtils.write(new File(publicFile), strpk);
//            System.out.println("公钥Base64编码:" + strpk);
//            System.out.println("私钥Base64编码:" + strprivk);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String data, String publicFile) {
        try {
            // Get public key
            String strpk = FileUtils.readFileToString(new File(publicFile));
            X509EncodedKeySpec pubX509 = new X509EncodedKeySpec(Base64.decodeBase64(strpk.getBytes()));
            KeyFactory keyf = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyf.generatePublic(pubX509);

            // To encrypt
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] dataToEncrypt = data.getBytes("utf-8");
            byte[] encryptedData = cipher.doFinal(dataToEncrypt);
            return Base64.encodeBase64String(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String encryptData, String privateFile) {
        try {
            // Get public key
            String strprivk = FileUtils.readFileToString(new File(privateFile));
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(Base64.decodeBase64(strprivk.getBytes()));
            KeyFactory keyf = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyf.generatePrivate(priPKCS8);

            // To encrypt
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] descryptData = Base64.decodeBase64(encryptData);
            byte[] descryptedData = cipher.doFinal(descryptData);
            return new String(descryptedData, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
