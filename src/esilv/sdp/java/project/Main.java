package esilv.sdp.java.project;



public class Main {
    public static void main(String[] args) {
        TrainInfo trainInfo = new TrainInfo();
        FindTrain query = new FindTrain();
        TrainInfo query_response = query.getPrice(trainInfo);
        System.out.println(query_response.getVilledepart());
    }
}
