import java.util.*;

public class Main {
    public static void main(String args[]){
        /* First example for printing strings to console
        String[] sentence = {"I'm", "John", "I'm", "21", "and", "I", "play", "badminton", "nationally!"};
        for (int i = 0; i < sentence.length; i++) {
            System.out.println(i + " " + sentence[i]);
        }*/

        /* Second example of taking inputs and storing and printing variables
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = str.nextLine();
        // Could also use int wordLength = word.length() instead
        System.out.println("You printed the word " +word+ " which has " +word.length()+ " letters in it."); */


        /*Third example shows different data types to use to store variables
        byte v1 = 14;
        char v2 = 'Y';
        String v3 = "Hello!";
        float v4 = 2.5f;
        short v5 = 307;
        byte v6 = -1;
        int v7 = 438000000;
        boolean v8 = false; */

        /*Fourth example shows concationation working
        String thanks = "Thank you,";
        String name = "miguel!";
        String order = "Your order number is #";
        int previousOrder = 715;

        System.out.println(thanks+" "+name.toUpperCase());
        System.out.println(order+(previousOrder+1)); */

        /*This fifth example is to help user find how much paint they need to paint a wall
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

        System.out.println("You will need "+ paintNeeded + " litres to paint wall overall");*/

    }
}
