package esilv.sdp.java;
import java.util.*;
import esilv.sdp.java.td01.ex01.UtilMath;
import up.mi.jgm.maths.Complexe;
import up.mi.jgm.maths.Rationnel;
import esilv.sdp.java.td01.ex01.Calculations;
import esilv.sdp.java.td01.ex02.UtilLists;
import esilv.sdp.java.td01.ex02.Element;

public class Main {
    public static void main(String[] args) {

        // EX 1
        System.out.println("" + UtilMath.somme3(1,2,3));


        Rationnel r1 = new Rationnel(1,1);
        Rationnel r2 = new Rationnel(2,4);
        System.out.println("" + r1.addition(r2));

        Complexe c1 = new Complexe(1,1);
        Complexe c2 = new Complexe(2,4);
        System.out.println("" + c1.getPartieReelle());

        Rationnel r3 = new Rationnel(2,1);
        r3 = Calculations.power(r3, 3);
        System.out.println("" + r3 );

        Complexe c3 = new Complexe(2,1);
        c3 = Calculations.addition(c3, c1);
        System.out.println("" + c3 );

        c2 = Calculations.multiplication(c2, c3);
        System.out.println("" + c2 );

        //EX 2

        List<Integer> list1 = Arrays.asList(1,3,2,4,6,5,7,6);
        System.out.println("" + UtilLists.getmax(list1) );

        Element a = new Element("Antoine");
        Element b = new Element("Baptiste");
        Element c = new Element("Carole");
        Element d = new Element("Damien");
        List<Element> list2 = Arrays.asList(b,a,d,c);
        Element.sort(list2);
        System.out.println("" + list2.get(0).name() );

        //EX 3


    }

}
