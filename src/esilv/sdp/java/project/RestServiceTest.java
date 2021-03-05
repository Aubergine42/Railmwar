package esilv.sdp.java.project;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class RestServiceTest {

    @org.junit.jupiter.api.Test
    void start() {
    }

    @org.junit.jupiter.api.Test
    void stop() {
    }



    @Test public void testConnecttoAPI(){
        ConnectAPI Train =  new ConnectAPI("https://f806224a-4304-4ed5-857a-ebdcfe4c075f@api.sncf.com/v1/");
        System.out.println("Success");
    }

    @Test public void testRequestAPI(){
        try {
            TrainInfo trainInfo =  new TrainInfo();
            FindTrain query = new FindTrain();
            TrainInfo query_response = query.getPrice(trainInfo);
            System.out.println(query_response.getVilledepart());
            System.out.println("Success");
        }catch (Exception e){
            System.out.println("Error");
        }
    }



}