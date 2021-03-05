package esilv.sdp.java.td01.ex03;

interface Sizeable {
    double compareperimiter(Figure a, Figure b);
    double comparesurface(Figure a, Figure b);
}


public class Test implements Sizeable{


    public double compareperimiter(Figure a, Figure b) {
        return a.perimeter() - b.perimeter();
    }

    public double comparesurface(Figure a, Figure b) {
        return a.surface() - b.surface();
    }
}
