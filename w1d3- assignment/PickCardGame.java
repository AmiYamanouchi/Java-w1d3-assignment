import java.lang.Math;

import jdk.internal.joptsimple.internal.Strings;


public class PickCardGame {
    
    public static void main(String[] args) {


        int cardNum = (int)(Math.random() * 13) + 1;

        int cardType = (int)(Math.random() * 4);

        String card = "";
        String type = "";
            
            switch (cardNum) {
                case 1: card = "Ace";
                break;
                case 11: card = "Jack";
                break;
                case 12: card = "Jack";
                break;
                case 13: card = "King";
                break;
            
                default: card = Integer.toString(cardNum);
                break;
            }

            switch (cardType) {
                case 0: type = "Hart";
                break;
                case 1: type = "Spade";
                break;
                case 2: type = "Diamond";
                break;
                case 3: type = "Clover";
                break;
            }

            System.out.println("the card you picked is " + type + " of "+ card);

        
    }
}
