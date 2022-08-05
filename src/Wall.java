import java.util.LinkedList;
import java.util.Scanner;

public class Wall {

    private int wallNo;
    private float wallWidth;
    private float wallHeight;
    private int NoCoats;
    private float wallArea;
    private String paintType;

    public Wall() {
        this.wallNo = wallNo;
        this.wallWidth = wallWidth;
        this.wallHeight = wallHeight;
        this.NoCoats = NoCoats;
        this.wallArea = wallArea;
        this.paintType = paintType;
    }

    public int getWallNo() {
        return wallNo;
    }

    public float getWallWidth() {
        return wallWidth;
    }

    public float getWallHeight() {
        return wallHeight;
    }

    public int getNoCoats() {
        return NoCoats;
    }

    public float getWallArea() {
        return wallArea;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setWallNo(int wallNo) {
        this.wallNo = wallNo;
    }

    public void setNoCoats(int noCoats) {
        NoCoats = noCoats;
    }

    public void setWallWidth(float wallWidth) {
        this.wallWidth = wallWidth;
    }

    public void setWallHeight(float wallHeight) {
        this.wallHeight = wallHeight;
    }

    public void setWallArea(float wallArea) {
        this.wallArea = wallArea;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "wallNo=" + wallNo +
                ", wallWidth=" + wallWidth +
                ", wallHeight=" + wallHeight +
                ", NoCoats=" + NoCoats +
                ", wallArea=" + wallArea +
                ", paintType='" + paintType + '\'' +
                '}';
    }

    public float calcQuadrilateral(float wallWidth, float wallHeight){
        float wallArea = wallWidth * wallHeight;

        return wallArea;
    }

    public float calcTriangle(float wallWidth, float wallHeight){
        float wallArea = (wallWidth * wallHeight)/2;

        return wallArea;
    }

    public float calcPaintNeeded(float wallArea, int noCoats){
        float paintNeeded = wallArea * noCoats;

        return paintNeeded;
    }


}
