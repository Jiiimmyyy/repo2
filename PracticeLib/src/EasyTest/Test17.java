package EasyTest;

import sun.nio.cs.ext.GBK;

import java.io.*;

public class Test17 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\AMing\\IdeaProjects\\PracticeLib\\src\\test_gbk.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\AMing\\IdeaProjects\\PracticeLib\\src\\test_UTF8.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        char[] data = new char[10];
        int len;
        while ((len= isr.read(data))!=-1){
            osw.write(data,0,len);
        }

        osw.close();
        isr.close();
        fos.close();
        fis.close();

    }
}
