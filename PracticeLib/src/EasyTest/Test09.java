package EasyTest;

import java.util.Arrays;

public class Test09 {
    public static String sortStr(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        return str;
    }
}
