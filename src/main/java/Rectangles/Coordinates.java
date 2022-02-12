package Rectangles;

/*Notes and assumptions:
We know rectangle has four points. So we set the following:
x1= bottom left
x2= bottom right
y1 = top left
y2 = top right
w1 = width of rectangle 1
w2= width of rectangle 2
h1 = height of rectangle 1
h2= height of rectangle 2*/


public class Coordinates {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int w1;
    private int w2;
    private int h1;
    private int h2;

    public Coordinates(int x1, int y1, int x2, int y2, int w1, int w2, int h1, int h2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.w1 = w1;
        this.w2 = w2;
        this.h1 = h1;
        this.h2 = h2;

    }

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {this.x1 = x1;}

    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getW2() {
        return w2;
    }
    public void setW2(int w2) {
        this.w2 = w2;
    }

    public int getW1() {return w1;}
    public void setW1(int w1) {this.w1 = w1;}

    public int getH1() {return h1;}
    public void setH1(int h1) {this.h1 = h1;}

    public int getH2() {return h2;}
    public void setH2(int h2) {this.h2 = h2;}
}
