package esilv.sdp.java.td01.ex03;
import esilv.sdp.java.td01.ex03.Vector;
public class Triangle extends Figure{
    public Point a;
    public Point b;
    public Point c;
    public double cote1;
    public double cote2;
    public double cote3;

    public Triangle(Point p1, Point p2, Point p3){
        a = p1;
        b = p2;
        c = p3;
        cote1 = new Vector(a,b).giveLength();
        cote2 = new Vector(b,c).giveLength();
        cote3 = new Vector(a,c).giveLength();

    }

    public double perimeter() {
        return cote1 + cote2 + cote3;
    }

    public double surface() {
        double s = perimeter() / 2;
        double area = Math.sqrt(s*(s - cote1) * (s - cote2) * (s-cote3));
        return area;
    }

    public Triangle translate(Vector v) {
        a.setLocation(a.getX() + v.getPointX().getX(), a.getY() + v.getPointY().getY()) ;
        b.setLocation(b.getX() + v.getPointX().getX(), b.getY() + v.getPointY().getY()) ;
        c.setLocation(c.getX() + v.getPointX().getX(), c.getY() + v.getPointY().getY()) ;
        return new Triangle(a,b,c);
    }
}
