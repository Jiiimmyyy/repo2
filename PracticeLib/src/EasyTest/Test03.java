package EasyTest;

public class Test03 {
    public static  int daysOfYear(int year,int month,int day){
        int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (year%4==0&&year%100!=0){
            daysOfMonth[1] = 29;
        }
        else if(year%400==0){
            daysOfMonth[1] = 29;
        }

        int days = 0;
        days+=day;

        for (int i = 0; i < month-1; i++) {
            days += daysOfMonth[i];
        }

        return days;
    }
}
