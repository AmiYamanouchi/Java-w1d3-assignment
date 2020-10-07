import java.lang.Math;

public class NumberGenerator {

    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 10);

        System.out.println(randomNum);


        randomNum = (int)(Math.random() * 50) + 50;

        System.out.println(randomNum);
        
    }


}