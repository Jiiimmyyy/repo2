package EasyTest;

import java.net.URL;

public class Test08 {
    public static String getUrlExName(URL url){
        String file = url.getFile();
        int index = file.indexOf(".");
        String substring = file.substring(index);


        return substring;
    }
}
