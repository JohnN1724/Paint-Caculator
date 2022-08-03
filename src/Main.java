import java.util.*;

public class Main {
    public static void main(String args[]){



        Scanner width = new Scanner(System.in);  // Create a Scanner object for width
        System.out.println("Enter width of wall in metres:");
        float wallWidth = width.nextLong();  // Read user input

        Scanner height = new Scanner(System.in);  // Create a Scanner object for height
        System.out.println("Enter height of wall in metres:");
        float wallHeight = height.nextLong();  // Read user input

        float canvasArea = wallWidth*wallHeight; // Gets area of wall

        float oneCoat = canvasArea/12; // 1 Litre of paint on average covers 12 metres squared of wall

        System.out.println("You will need "+ oneCoat + " litres to paint wall with one coat");

        Scanner coats = new Scanner(System.in);  // Create a Scanner object for number of coats
        System.out.println("How many coats would you like to apply?");
        int coatNo = coats.nextInt();  // Read user input

        float paintNeeded = oneCoat * coatNo;

        System.out.println("You will need "+ paintNeeded + " litres to paint wall overall");

    }
}
