package esilv.sdp.java.project;

public class RestAdapter {

    private RestService restService;

    public RestAdapter(RestService restService) {
        this.restService = restService;
    }

    /**
     * Method that starts inner services and return current state
     *
     * @return true if started
     */
    public boolean start(){
        if(restService.isWorking()){
            return true;
        }
        restService.start();
        return restService.isWorking();
    }
}
