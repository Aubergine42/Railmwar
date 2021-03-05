package esilv.sdp.java.td01.ex01;

public class UtilMath {

    public static int somme3(int a, int b, int c){
        return a+b+c;
    }

    public static long fact(int n){
        if(n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static long comb(int n, int p){
        return fact (n) / (fact(p) * fact(n-p));
    }

    public static long puissance(int n, int m){
        int result = 1;
        for(;m != 0; --m){
            result *= n;
        }
        return result;
    }

}