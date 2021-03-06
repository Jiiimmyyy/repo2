package EasyTest;

public class TestWeek {

    enum Week {
        MONDAY(1, "星期一"),
        TUESDAY(2, "星期二"),
        WEDNESDAY(3, "星期三"),
        THURSDAY(4, "星期四"),
        FRIDAY(5, "星期五"),
        SATURDAY(6, "星期六"),
        SUNDAY(7, "星期日");
        private int number;
        private String description;

        Week(int number, String description) {
            this.number = number;
            this.description = description;
        }

        public static Week getByNumber(int number) {
            switch (number) {
                case 1:
                    return MONDAY;
                case 2:
                    return TUESDAY;
                case 3:
                    return WEDNESDAY;
                case 4:
                    return THURSDAY;
                case 5:
                    return FRIDAY;
                case 6:
                    return SATURDAY;
                case 7:
                    return SUNDAY;
                default:
                    return null;
            }
        }

        @Override
        public String toString() {
            return  "(" + number + ","+ description + ")";
        }
    }
}
