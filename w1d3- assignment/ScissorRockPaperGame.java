import java.util.Scanner;
import java.lang.Math;


public class ScissorRockPaperGame {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int scissor = 0; 
        // int rock = 1; 
        // int paper = 2;

        int computer = (int)(Math.random() * 2);

        System.out.println("choose by number : Scissor(0), Rock(1), Paper(2)");

        int choosed = input.nextInt();

        if(computer == 0) {
            switch (choosed) {
                case 0: System.out.println("The computer is scissor. You are scissor.  draw");
                break;
                case 1: System.out.println("The computer is scissor. You are rock. You Win");
                break;
                case 2: System.out.println("The computer is scissor. You are paper. You Lose");
                break;
            }
        } else if(computer == 1) {
            switch (choosed) {
                case 0: System.out.println("The computer is rock. You are scissor. You Lose");
                break;
                case 1: System.out.println("The computer is rock. You are rock.  Draw");
                break;
                case 2: System.out.println("The computer is rock. You are paper.  You Win");
                break;
            }
        } else if(computer == 2) {
            switch (choosed) {
                case 0: System.out.println("The computer is paper. You are scissor.  You Win");
                break;
                case 1: System.out.println("The computer is paper. You are rock.  You Lose");
                break;
                case 2: System.out.println("The computer is paper. You are paper.  Draw");
                break;
            }
        }

    }
}
