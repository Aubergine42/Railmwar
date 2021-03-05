package esilv.sdp.java.td01.ex03;

public class Vector {
    public Point p;
    public Point q;

    public Vector(){
        p = new Point();
        q = new Point();
    }

    public Vector(Point a, Point b){
        p = a;
        q = b;
    }
    public Point getPointX(){
        return p;
    }

    public Point getPointY(){
        return q;
    }

    public double giveLength() {
        int xdiff = q.getX() - p.getX();
        int ydiff = q.getY() - p.getY();
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public void move(Point a, Point b){
        p = a;
        q = b;
    }


}
