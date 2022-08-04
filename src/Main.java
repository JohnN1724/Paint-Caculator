import java.util.*;

public class Main {
    public static void main(String args[]){

        LinkedList<Wall> walls = new LinkedList<Wall>();

        Wall w = new Wall();

        Scanner Width = new Scanner(System.in);  // Create a Scanner object for width
        System.out.println("Enter width of wall in metres:");
        float width = Width.nextLong();  // Read user input
        w.setWallWidth(width);

        Scanner Height = new Scanner(System.in);  // Create a Scanner object for height
        System.out.println("Enter height of wall in metres:");
        float height = Height.nextLong();  // Read user input
        w.setWallHeight(height);

        Scanner coats = new Scanner(System.in);  // Create a Scanner object for number of coats
        System.out.println("How many coats would you like to apply?");
        int coatNo = coats.nextInt();  // Read user input
        w.setNoCoats(coatNo);

        Scanner type = new Scanner(System.in);  // Create a Scanner object for number of coats
        System.out.println("What paint type would you like to use?");
        String paintType = type.nextLine();  // Read user input
        w.setPaintType(paintType);

        Scanner shape = new Scanner(System.in);  // Create a Scanner object for number of coats
        System.out.println("Is the wall 4 sided or 3 sided?");
        int wallSides = shape.nextInt();  // Read user input

        if(wallSides == 3){
            w.setWallArea(w.calcTriangle(width, height));
        } else if(wallSides == 4){
            w.setWallArea(w.calcQuadrilateral(width, height));
        }

        walls.add(w);

        System.out.println(w.toString());
        System.out.println(walls);
    }
}
