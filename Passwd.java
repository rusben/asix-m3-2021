import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Passwd   {
    public static void main(String[] args) throws NoSuchAlgorithmException {
      Scanner scanner = new Scanner(System.in);

      // Usa esta instruccion para encryptar el password generado
      // String encrypted = Base64.getEncoder().encodeToString(MessageDigest.getInstance("md5").digest((String.valueOf(password)).getBytes()));
        
    int usuarios = scanner.nextInt();
    int UID = 1001;
        
        for (int i = 0; i < usuarios; i++) {
            
            int password = (UID << 29 ^ UID << 17) >>> 1;
            
            String encrypted = Base64.getEncoder().encodeToString(MessageDigest.getInstance("md5").digest((String.valueOf(password)).getBytes()));
            
            System.out.println("user"+UID+":$1$"+encrypted+":"+UID+":1000:Usuari "+UID+":/home/user"+UID+":/bin/bash");
            
            UID++;
        }

    }
}
