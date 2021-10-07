package EasyTest;

public class Test01 {
    public static int plus(int last){
        int result = 0;
        if (last%2==0||last<=1){
            System.out.println("你必须输入大于1的奇数");
            return -1;
        }
        for (int i = 1; i <= last; i+=2) {
            System.out.print(i);
            if (i!=last){
                System.out.print("+");
            }
            result += i;
        }
        System.out.println(" = "+result);
        return result;
    }
}
