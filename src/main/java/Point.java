public class Point {
    private final int xPoint;
    private final int yPoint;

    public Point(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    @Override
    public String toString() {
        return  xPoint + " " + yPoint;
    }

    public Point increaseY() {
        return new Point(xPoint,yPoint+1);
    }
}
