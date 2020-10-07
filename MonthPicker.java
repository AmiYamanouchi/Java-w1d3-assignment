import java.util.Scanner;

public class MonthPicker {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number between 1-12");

        int month = input.nextInt();

        switch (month) {
            case 1: System.out.println("Jan");
            break;
            case 2: System.out.println("Feb");
            break;
            case 3: System.out.println("Mar");
            break;
            case 4: System.out.println("Apr");
            break;
            case 5: System.out.println("May");
            break;
            default : System.out.println("thats not a month");
        }
    }
    
}
