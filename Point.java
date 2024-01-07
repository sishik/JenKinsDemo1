public class Point {
    // write the code of point class here
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point clone) {
        this.x = clone.x;
        this.y = clone.y;
    }
}
