package main.java.Encryption;

//import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class EncryptionUtil {

    private static final String TRANSFORMATION_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String TRANSFORMATION_ALGORITHM_KEY = "AES";
    private static final String MESSAGE_ALGORITHM = "SHA-512";
    private static final int KEY_LENGTH_IN_BYTES = 16;

    private String encryptionKey;
    private String initializationVector;

    /**
     * Can be sued to Encrypt an Key.
     * It uses AES-128 BIT algorithm.
     *
     * @param plainText
     * @return
     */
    public String doEncrypt(String plainText) {
        byte[] encodedBytes = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance(TRANSFORMATION_ALGORITHM);
            byte[] key = encryptionKey.getBytes(StandardCharsets.UTF_8);
            MessageDigest sha = MessageDigest.getInstance(MESSAGE_ALGORITHM);
            key = sha.digest(key);
            // use only first 128 bit
            key = Arrays.copyOf(key, KEY_LENGTH_IN_BYTES);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, TRANSFORMATION_ALGORITHM_KEY);
            IvParameterSpec iv = new IvParameterSpec(initializationVector.getBytes(StandardCharsets.UTF_8));
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, iv);
            byte[] inputBytes = plainText.getBytes();
            byte[] outputBytes = cipher.doFinal(inputBytes);
            //encodedBytes = Base64.encodeBase64(outputBytes);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException
                                        | IllegalBlockSizeException | InvalidAlgorithmParameterException ex) {
            //LOGGER.error("Exception while encrypting password", ex);
        }
        return new String(encodedBytes);
    }

    /**
     * Can be used to Decrypt an String.
     * It uses AES-128 BIT algorithm.
     *
     * @param encryptedText
     * @return
     */
    public String doDecrypt(String encryptedText) {
        try {
            Cipher dcipher = Cipher.getInstance(TRANSFORMATION_ALGORITHM);
            byte[] key = encryptionKey.getBytes(StandardCharsets.UTF_8);
            MessageDigest sha = MessageDigest.getInstance(MESSAGE_ALGORITHM);
            key = sha.digest(key);
            // use only first 128 bit
            key = Arrays.copyOf(key, KEY_LENGTH_IN_BYTES);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, TRANSFORMATION_ALGORITHM_KEY);
            IvParameterSpec iv = new IvParameterSpec(initializationVector.getBytes(StandardCharsets.UTF_8));
            dcipher.init(Cipher.DECRYPT_MODE, secretKeySpec, iv);
            // decode with base64 to get bytes
            //byte[] dec = Base64.decodeBase64(encryptedText.getBytes());
            //byte[] utf8 = dcipher.doFinal(dec);
            byte[] utf8 = dcipher.doFinal(encryptedText.getBytes());
            // create new string based on the specified charset
            return new String(utf8, StandardCharsets.UTF_8);
        } catch (Exception e) {
        }
        return null;
    }
}