public class MillionDollarSalary {
    public static void main(String[] args) {
        double salary = 0.01;  // starting salary is 1 penny
        int days = 0;  // number of days worked

        // continue to work until the salary is at least a million dollars per day
        while (salary < 1000000) {
            days++;
            salary *= 2;
        }

        System.out.println("It takes " + days + " days to earn a million dollars per day.");
    }
}
