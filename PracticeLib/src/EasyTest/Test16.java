package EasyTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Test16 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();

        //pro.load(new FileInputStream("info.properties"));
        //String username = pro.getProperty("user");
        //System.out.println(username);
        Random random = new Random();
        int i = random.nextInt(1000);
        System.out.println(i);
        double v = random.nextDouble();
        System.out.println(v);
    }
}
