package esilv.sdp.java.td01.ex03;

public class Point {
    public int x;
    public int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Point getLocation(){
        return new Point(this.x,this.y);
    }

    public void setLocation(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
}
