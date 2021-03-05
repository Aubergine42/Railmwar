package esilv.sdp.java.project;


import java.util.Date;

public class CarInfo {

    public String villedepart;
    public String villearrivee;
    public String heurealler;
    public String heureretour;
    public int prix;
    public String classe;
    public String reduction;

    public CarInfo(){

    }

    public CarInfo(String[] args, int prix1) {
        villedepart = args[0];
        villearrivee = args[1];
        prix = prix1;
        if (args.length > 2)
            heurealler = args[2];
        if (args.length > 3)
            heureretour = args[3];
        if (args.length > 4)
            classe = args[4];
        if (args.length > 5)
            reduction = args[5];

    }

    public String getVilledepart(){
        return villedepart;
    }
    public String getVillearrivee(){
        return villearrivee;
    }
    public String getHeureallereurealler(){
        return heurealler;
    }
    public String getHeureretour(){
        return heureretour;
    }
    public int getPrix() { return prix;}



}