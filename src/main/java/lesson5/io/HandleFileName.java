package lesson5.io;

/**
 * xu ly ten cua file
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 26/05/2024 13:14
 * @since JDK11
 */
public class HandleFileName {
    public static void main(String[] args) {
        String sourceFileName = "/Users/thanhsonphan/Downloads/co.to.quoc.png";
        int dotIndex = sourceFileName.lastIndexOf(".");
        System.out.println(dotIndex);
        if(dotIndex!=-1){
            String suffix = sourceFileName.substring(dotIndex);
            System.out.println(suffix);
        }
    }
}
