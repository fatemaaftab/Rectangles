package Rectangles;


public class Rectangles {
    private Coordinates bottomLeft;
    private Coordinates topRight;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int w1;
    private int w2;
    private int h1;
    private int h2;

    public Rectangles(Coordinates bottomLeft, Coordinates topRight) {
        this.bottomLeft = bottomLeft; //save value of bottom left
        this.topRight = topRight; //save value of top right
    }

    public Coordinates getBottomLeft() {
        return bottomLeft;
    }

    public Coordinates getTopRight() {
        return topRight;
    }

    public void setBottomLeft(Coordinates bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public void setTopRight(Coordinates topRight) {
        this.topRight = topRight;
    }

    public boolean rectangleIntersection(Rectangles r2) {
        //When one rectangle is intersecting another rectangle r2
        if (this.topRight.getY2() < r2.bottomLeft.getX1()) {
            return false;
        }
        if (this.bottomLeft.getX1() > r2.topRight.getY2()) {
            return false;
        }
        //When one rectangle is adjacent to another rectangle r2
        if (this.topRight.getX2() < r2.bottomLeft.getX2()) {
            return false;
        }
        if (this.bottomLeft.getX1() > r2.bottomLeft.getY2()) {
            return false;
        }

        return true;
    }

//When one rectangle is inside another rectangle r2 or vice versa
    public boolean rectangleIsInsideAnother(Rectangles r2) {
        if ((x2 + (w2 / 2) <= x1 - (w1 / 2)) && (x2 - (w2 / 2) >= x1 - (w1 / 2)) && (y2 + (h2 / 2) <= (y1 + (h1 / 2))) && (y2 - (h2 / 2) >= (y1 - (h1 / 2)))) {
            System.out.println("One rectangle is inside another");
            return true;
        } else {
            return false;
        }

    }
}