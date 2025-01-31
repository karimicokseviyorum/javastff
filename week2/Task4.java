public class Task4 {
    public static void main(String[] args) {
        final int WORKING_HOURS_PER_DAY = 8;
        final int NORMAL_WAGE = 12;
        final float EXTRA_RATE = 1.25f;
        final float OVERTIME_WAGE = NORMAL_WAGE * EXTRA_RATE;
        final float HOLIDAY_WAGE = 17.5f;
        boolean isHoliday = false;
        float totalWage = 0;
        int hoursWorked = 9;

        if (isHoliday) {
            totalWage = HOLIDAY_WAGE * (8) + (hoursWorked >= WORKING_HOURS_PER_DAY ? HOLIDAY_WAGE * EXTRA_RATE * (hoursWorked - WORKING_HOURS_PER_DAY) : 0);
        } else {
            totalWage = NORMAL_WAGE * (8) + (hoursWorked >= WORKING_HOURS_PER_DAY ? OVERTIME_WAGE * (hoursWorked - WORKING_HOURS_PER_DAY) : 0);
        }
        System.out.println("Total wage: " + totalWage);
    }
}