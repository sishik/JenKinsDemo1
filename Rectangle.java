public class Rectangle {
    // write the code of Rectangle class here
    Point topLeft;
    Point bottomRight;

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        this.topLeft = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    public Rectangle(Rectangle clone) {
        this.topLeft = new Point(clone.topLeft);
        this.bottomRight = new Point(clone.bottomRight);
    }


//   i. It should have 2 data-members
// 1. topLeft (Point)
// 2. bottomRight (Point)

//    ii. Add a constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY
//    iii. Add a constructor with 2 parameters of type Point: topLeft, bottomRight
//    iv. Add a constructor with 1 parameter of type Rectangle
//    v. Make sure that Rectangle constructors make deep copie
}
