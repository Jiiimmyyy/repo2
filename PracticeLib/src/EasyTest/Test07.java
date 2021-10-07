package EasyTest;

public class Test07 {
    public static String Reverse(String str){
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        str = s.toString();
        return str;
    }
}
