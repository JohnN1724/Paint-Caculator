public class WallCalcs {
    private int NoWalls;
    private int wallWidth;
    private int wallHeight;
    private int NoCoats;

    public WallCalcs() {
        this.NoWalls = NoWalls;
        this.wallWidth = wallWidth;
        this.wallHeight = wallHeight;
        this.NoCoats = NoCoats;
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

    public float calcQuadrilateral(){
        float wallArea = wallWidth * wallHeight;

        return wallArea;
    }

    public float calcTriangle(){
        float wallArea = (wallWidth * wallHeight)/2;

        return wallArea;
    }


}
