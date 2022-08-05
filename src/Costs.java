public class Costs extends Wall {
    private float price;
    private float wallArea;
    private String paintType;

    public Costs() {
        this.wallArea = wallArea;
        this.price = price;
        this.paintType = paintType;
    }

    public float getPrice() {
        return price;
    }

    public float getWallArea() {
        return wallArea;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setWallArea(float wallArea) {
        this.wallArea = wallArea;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public float getGlossCost(float price) {
        float cost = wallArea * 20;

        return cost;
    }

    public float getMatteCost(float price) {
        float cost = wallArea * 25;

        return cost;
    }

    @Override
    public String toString() {
        return "Costs{" +
                "'Paint Type=" + paintType +
                ", Wall Area=" + wallArea +
                ", Price=" + price + '\'' +
                '}';
    }
}
