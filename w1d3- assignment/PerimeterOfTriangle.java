import java.util.Scanner;

public class PerimeterOfTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int edgeA, edgeB, edgeC;

        System.out.println("enter 3 edges for a triangle");

        edgeA = input.nextInt();
        edgeB = input.nextInt();
        edgeC = input.nextInt();

        int perimeter = edgeA + edgeB + edgeC;

        if(edgeA + edgeB > edgeC && edgeB + edgeC > edgeA && edgeA + edgeC > edgeB) {
            System.out.println("the perimeter of a triangle is  " + perimeter);
        } else {
            System.out.println("its not possible to be triangle");
        }

        


    }
    
}
