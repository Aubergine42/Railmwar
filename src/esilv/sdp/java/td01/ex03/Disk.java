package esilv.sdp.java.td01.ex03;

public class Disk extends Figure{
    public Point center;
    public Vector rayon;

    public Disk(Point p, Vector v){
        center = p;
        rayon = v;

    }

    public double perimeter() {
        return rayon.giveLength() * 2 * 3.14;
    }

    public double surface() {
        return 3.14 * rayon.giveLength() * rayon.giveLength();
    }

    public Disk translate(Vector v) {
        center.setLocation(center.getX() + v.getPointX().getX(), center.getY() + v.getPointY().getY()) ;
        return new Disk(center, rayon);
    }
}
