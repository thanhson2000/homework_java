package lesson5.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * copy anh tren mang ve may
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 26/05/2024 17:27
 * @since JDK11
 */
public class CopyImages {
    ArrayList<String> filterPngLink(String imageUrls) {
        ArrayList<String> pngLinks = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(imageUrls);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String link;
            while ((link = bufferedReader.readLine()) != null) {
                if (link.contains(".png")) {
                    pngLinks.add(link);
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pngLinks;
    }

    void copyImage(String absPath, String pngLink) {
        String copyImagePath = setFileAbsPath(absPath,pngLink);
        try {
            URL url = new URL(pngLink);
            BufferedInputStream fileInputStream = new BufferedInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(copyImagePath);
            fileOutputStream.write(fileInputStream.readAllBytes());
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            System.out.println("URL khong dung");
        } catch (IOException e) {
            System.out.println("File da ton tai");
        }
    }

    private String getFileName(String path) {
        int index = path.lastIndexOf("/");
        return path.substring(index + 1);
    }

    public String setFileAbsPath(String absPath, String pngLink){
        return absPath + "/copy_" + getFileName(pngLink);
    }

    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        CopyImages copyImages = new CopyImages();
        String absPath = "/Users/thanhsonphan/Downloads/Images";
        String imageUrlsPath = "/Users/thanhsonphan/Desktop/JAVA_Learning/untitled/src/main/java/lesson5/io/ImageUrls";
        File folder = new File(absPath);
        ArrayList<String> pngLinkList = copyImages.filterPngLink(imageUrlsPath);

        /*
         Kiem tra xem folder co ton tai khong ?
           1. Ton tai:  Kiem tra folder co rong hay khong ?
                 1.1. Khong rong : Kiem tra file copy co trung ten khong ?
                    1.1.1. Khong trung ten : copy file
                    1.1.2. Co trung ten : khong can copy
                 1.2. Rong : copy tat ca file
           2. Khong ton tai:
              2.1. Tao folder
              2.2. Copy tat ca file
         */

        // 1. Folder ton tai
        if( folder.isDirectory() && folder.exists()){
            // 1.1. Folder khong rong
            if(folder.length() > 0){
                for (File file : folder.listFiles()) {
                    for (String pngLink : pngLinkList) {
                        // 1.1.1, 1.1.2. File copy khong trung ten thi copy file, neu trung ten thi bo qua
                        if( ! file.getAbsolutePath().equals(copyImages.setFileAbsPath(absPath,pngLink))){
                            copyImages.copyImage(absPath,pngLink);
                        }
                    }
                }
            }else {
                // 1.2. Folder rong, thi copy het tat ca file
                for (String pngLink : pngLinkList) {
                    copyImages.copyImage(absPath,pngLink);
                }
            }
        }else{
            // 2. Folder khong ton tai
            // 2.1. Tao folder
            folder.mkdir();

            // 2.2. Copy tat ca file
            for (String pngLink : pngLinkList) {
                copyImages.copyImage(absPath,pngLink);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Copy file hoan tat !!!");
        System.out.println("Thoi gian xu ly: "+(endTime-beginTime)/1000+" s");
    }
}