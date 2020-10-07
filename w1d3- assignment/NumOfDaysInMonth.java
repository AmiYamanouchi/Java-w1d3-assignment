import java.util.Scanner;

public class NumOfDaysInMonth {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter the year");

        int year = input.nextInt();
        // System.out.println(year);

        System.out.println("enter the month");

        int month = input.nextInt();
        // System.out.println(month);

        if(year % 4 == 0) {
            if(month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30days");
            } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31days");
            } else if(month == 2) {
                System.out.println("28days");
            }
        } else {
            if(month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30days");
            } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31days");
            } else if(month == 2) {
                System.out.println("29days");
            }
        }


    }
    
}
