import java.util.*;

public class Main {

    public static void main(String args[]){

        LinkedList<Wall> walls = new LinkedList<Wall>();

        Costs matte = new Costs();
        matte.setPaintType("matte");
        Costs glossy = new Costs();
        glossy.setPaintType("glossy");

        Scanner numberOfWalls = new Scanner(System.in);  // Create a Scanner object for number of coats
        System.out.println("How many walls do you have to paint?");
        int wallNo = numberOfWalls.nextInt();  // Read user input

        for(int i = 0; i < wallNo; i++){

            Wall w = new Wall();

            w.setWallNo(i+1);

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
            System.out.println("Would you like to use glossy or matte paint?");
            String paintType = type.nextLine().toLowerCase();  // Read user input
            w.setPaintType(paintType);

            Scanner shape = new Scanner(System.in);  // Create a Scanner object for number of coats
            System.out.println("Is the wall 4 sided or 3 sided?");
            int wallSides = shape.nextInt();  // Read user input

            if (wallSides == 3) {
                w.setWallArea(w.calcTriangle(width, height));
                float area = w.getWallArea();
                if(w.getPaintType() == "glossy"){
                    glossy.setWallArea((glossy.getWallArea() + area) * w.getNoCoats());
                } else if(w.getPaintType() == "matte") {
                    matte.setWallArea((matte.getWallArea() + area) * w.getNoCoats());
                }


            } else if (wallSides == 4) {
                w.setWallArea(w.calcQuadrilateral(width, height));
                float area = w.getWallArea();
                if(w.getPaintType() == "glossy"){
                    glossy.setWallArea((glossy.getWallArea() + area) * w.getNoCoats());
                } else if(w.getPaintType() == "matte") {
                    matte.setWallArea((matte.getWallArea() + area) * w.getNoCoats());
                }
            }

            System.out.println("New wall added: " + w.toString());

            walls.add(w);
        }

        System.out.println("All entered wall information:");

        for (int i = 0; i < walls.size(); i++) {
            System.out.println(i +" = "+walls.get(i));
        }

        glossy.getGlossCost(glossy.getWallArea());
        matte.getMatteCost(matte.getWallArea());

        System.out.println("Total Costs:");
        System.out.println(matte.toString());
        System.out.println(glossy.toString());

    }
}
