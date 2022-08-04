public class WallCalcs {
    private int NoWalls;
    private int wallWidth;
    private int wallHeight;
    private int NoCoats;
    private float wallArea;

    public WallCalcs() {
        this.NoWalls = NoWalls;
        this.wallWidth = wallWidth;
        this.wallHeight = wallHeight;
        this.NoCoats = NoCoats;
        this.wallArea = wallArea;
    }

    public int getNoWalls() {
        return NoWalls;
    }
    public int getWallWidth() {
        return wallWidth;
    }
    public int getWallHeight() {
        return wallHeight;
    }
    public int getNoCoats() {
        return NoCoats;
    }
    public float getWallArea() {
        return wallArea;
    }

    public void setNoCoats(int noCoats) {
        NoCoats = noCoats;
    }
    public void setNoWalls(int noWalls) {
        NoWalls = noWalls;
    }
    public void setWallWidth(int wallWidth) {
        this.wallWidth = wallWidth;
    }
    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }
    public void setWallArea(float wallArea) {
        this.wallArea = wallArea;
    }

    public float calcQuadrilateral(int wallWidth, int wallHeight){
        float wallArea = wallWidth * wallHeight;

        return wallArea;
    }

    public float calcTriangle(int wallWidth, int wallHeight){
        float wallArea = (wallWidth * wallHeight)/2;

        return wallArea;
    }

    public float calcPaintNeeded(float wallArea, int noCoats){
        float paintNeeded = wallArea * noCoats;

        return paintNeeded;
    }


}
