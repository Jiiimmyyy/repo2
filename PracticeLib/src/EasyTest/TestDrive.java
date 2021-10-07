package EasyTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入1-7获取今天星期几");
        int number = input.nextInt();
        TestWeek.Week w = TestWeek.Week.getByNumber(number);
        System.out.println("今天是:"+w);
    }
}
