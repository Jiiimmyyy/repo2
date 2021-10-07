package EasyTest;

public class Test05 {
    public static int CountFactorial(int last){
        int result = 0;
        int factorial = 1;
        for (int i = 1; i <= last; i++) {
            factorial = 1;
            for (int j = 1; j <= last; j++) {
                factorial*=j;
            }
            result+=factorial;
            System.out.print(i+"!");
            if (i!=last)
                System.out.print("+");
        }

        return result;
    }
}
