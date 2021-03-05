package esilv.sdp.java.project;

public class FindTrain {
    public TrainInfo TrainInfo;

    public FindTrain(){ }

    public FindTrain(TrainInfo trainInfo){
        TrainInfo = trainInfo;
    }

    public TrainInfo getPrice(TrainInfo trainInfo){
        //Connect to the API
        ConnectAPI Train =  new ConnectAPI("https://f806224a-4304-4ed5-857a-ebdcfe4c075f@api.sncf.com/v1/");

        //Request to the API
        Train.executeGet("https://f806224a-4304-4ed5-857a-ebdcfe4c075f@api.sncf.com/v1/coverage/");

        System.out.println(Train);
        TrainInfo result = new TrainInfo();

        return result;
    }
    // Return le transport le plus avantageux entre train et voiture
    public Object CompareTrainCar(TrainInfo train, CarInfo car){
        // comparer prix et durée de trajet
        int diffprice = train.getPrix() - car.getPrix();
        if (diffprice > 0)
            return (train);
        else
            return car;
    };

}
