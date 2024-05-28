package lesson5.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * hoc ve BufferedInputStream
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 26/05/2024 16:12
 * @since JDK11
 */
public class AboutBufferedInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/thanhsonphan/Downloads/Facebook.mp4");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] allData ;
            long beginTime = System.currentTimeMillis();
            allData = bufferedInputStream.readAllBytes();
            long endTime =  System.currentTimeMillis();
            System.out.println("Thoi gian xu ly: "+(endTime-beginTime)+" ms");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
