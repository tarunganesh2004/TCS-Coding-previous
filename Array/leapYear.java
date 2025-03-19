public class leapYear {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
        
    }
}
