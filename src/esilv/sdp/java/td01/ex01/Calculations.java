package esilv.sdp.java.td01.ex01;
import up.mi.jgm.maths.Complexe;
import up.mi.jgm.maths.Rationnel;
import esilv.sdp.java.td01.ex01.UtilMath;

public class Calculations {

    public static Rationnel power(Rationnel r, int n){
        Rationnel result = new Rationnel(1,1);
        for(;n != 0; --n){
            result = result.multiplication(r) ;
        }
        return result;
    }

    public static Complexe addition(Complexe c1, Complexe c2) {
        return new Complexe(c1.getPartieReelle() + c2.getPartieReelle(), c1.getPartieImaginaire() + c2.getPartieImaginaire());
    }

    public static Complexe multiplication(Complexe c1, Complexe c2) {
        double reelle =  c1.getPartieReelle() * c2.getPartieReelle() - c1.getPartieImaginaire() * c2.getPartieImaginaire();
        double imaginaire = c1.getPartieReelle() * c2.getPartieImaginaire() + c1.getPartieImaginaire() * c2.getPartieReelle();
        return new Complexe( reelle , imaginaire);
    }


}
