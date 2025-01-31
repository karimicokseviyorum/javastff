public class SalaryAdvanced {

    public static void main(String[] args) {

        // Declare and initialise variables
        double workingHours = 9;
        double hourlySalary = 12.00;
        double salaryHoliday = 17.50;
        double overtimeRate = 1.25;
        boolean weekdays = true;
        
        // In this variable we store the earnings depending on the situation
        double salary;

        // Salary w/o overtime
        if (workingHours <= 8.0) {
            if (weekdays) {
                salary = hourlySalary * workingHours;
            } else {
                salary = salaryHoliday * workingHours;
            }

            /* or by using tertiary ?-Operator:
            double salary = (weekdays ? hourlySalary : salaryHoliday) * workingHours;
             */

            System.out.println("Regular Salary: " + salary + " EUR");

        // Salary w/ overtime
        } else {
            if (weekdays) {
                salary = hourlySalary * (8.0 + overtimeRate * (workingHours - 8.0));
            } else {
                salary = salaryHoliday * (8.0 + overtimeRate * (workingHours - 8.0));
            }

            /* or by using tertiary ?-Operator:
            double salary = (weekdays ? hourlySalary : salaryHoliday) * 8.0
                    + (weekdays ? hourlySalary : salaryHoliday) * overtimeRate * (workingHours - 8.0);
             */

            // Output
            System.out.println("Salary with overtime pay): " + salary + " EUR");
        }
    }
} 