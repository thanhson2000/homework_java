package lesson5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * sao chep file
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 25/05/2024 07:56
 * @since JDK11
 */
public class SaochepFile {
    public static void main(String[] args) {
        File source = new File("");
        File copyFile = new File("");
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
            int a = 0;
            while((a=fileInputStream.read()) !=-1){
                fileOutputStream.write(a);
            }
            fileOutputStream.flush();

            fileInputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
