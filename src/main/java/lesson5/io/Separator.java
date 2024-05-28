package lesson5.io;

import java.io.File;

/**
 * File.separator
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 26/05/2024 15:40
 * @since JDK11
 */
public class Separator {
    public static void main(String[] args) {
        String separator = File.separator;
        System.out.println(System.getProperty("os.name"));
        System.out.println(separator);
    }
}
