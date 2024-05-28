package lesson5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * sao chep file
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 25/05/2024 07:56
 * @since JDK11
 */
public class SaochepFile {
    String getSuffix(String fullPath){
        int index = fullPath.lastIndexOf(".");
        // kiem tra xem dau . co ton tai trong path ko
        if (index != -1){
            return fullPath.substring(index);
        }
        return null;
    }

    String getPath(String fullPath){
        int index = fullPath.lastIndexOf("/");
        if(index != -1){
            return fullPath.substring(0,index+1);
        }
        return null;
    }
     void copyFile(String sourceFileName, String copyFileName) {
        File source = new File(sourceFileName);
        String copyPath = getPath(sourceFileName)+copyFileName+getSuffix(sourceFileName);

        File copyFile = new File(copyPath);
        long beginTime = System.currentTimeMillis();
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
            byte[] allData = fileInputStream.readAllBytes();
            fileOutputStream.write(allData);
            fileOutputStream.flush();

            fileInputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thoi gian xu li: "+(endTime-beginTime)+"ms");
    }

    public static void main(String[] args) {
        SaochepFile saochepFile = new SaochepFile();
        String inputPath = "/Users/thanhsonphan/Downloads/design-patterns-en.pdf";
        saochepFile.copyFile(inputPath,"copy_design_pattens_en");
    }
}
