package esilv.sdp.java.project;

public class RestService {

    private final String type;
    private boolean isWorking;


    public RestService(String type) {
        this.type = type;
        isWorking = false;
    }

    public void start() {
        if("REST".equals(this.type)){
            isWorking = true;
        }
        System.out.println("Attention, service inconnu. Impossible de lancer le type demandé...");
    }

    public void stop() {
        if("REST".equals(this.type)){
            isWorking = false;
        }
        System.out.println("Attention, service inconnu. Impossible de stopper le type demandé...");
    }

    public boolean isWorking() {
        return isWorking;
    }
}
