package lesson5.io;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

/**
 * hoc ve file
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 27/05/2024 22:02
 * @since JDK11
 */
public class AboutFile {
    public static void main(String[] args) {
        CopyImages copyImages = new CopyImages();
        String imagesPath = "/Users/thanhsonphan/Downloads/Images";
        String urlFilePath = "/Users/thanhsonphan/Desktop/JAVA_Learning/untitled/src/main/java/lesson5/io/ImageUrls";
        ArrayList<String> imageUrls =  copyImages.filterPngLink(urlFilePath);
        ArrayList<String> copyImageUrls = new ArrayList<>();
        for (String imageUrl : imageUrls) {
            copyImageUrls.add(copyImages.setFileAbsPath(imagesPath,imageUrl));
        }

        File images = new File(imagesPath);
        File[] files = images.listFiles();
        ArrayList<String> fileNameList = new ArrayList<>();
        for (File file : files) {
            fileNameList.add(file.getAbsolutePath());
        }

        for (String copyImageUrl : copyImageUrls) {
            if(fileNameList.contains(copyImageUrl)){
                System.out.println(copyImageUrl);
            }
        }
    }
}
