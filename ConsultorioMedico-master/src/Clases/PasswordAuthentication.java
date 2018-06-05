package Clases;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public final class PasswordAuthentication
{
    public String hashing(String cadena) throws NoSuchAlgorithmException{
        byte[] data = cadena.getBytes();
    MessageDigest digester = MessageDigest.getInstance("SHA-256");
    digester.update(data);
    return Base64.getEncoder().encodeToString(digester.digest());
    }
}