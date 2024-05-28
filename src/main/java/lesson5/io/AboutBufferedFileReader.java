package lesson5.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * hoc ve BufferedFileReader
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 26/05/2024 16:26
 * @since JDK11
 */
public class AboutBufferedFileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (bufferedReader.readLine()!=null){
                line = bufferedReader.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
