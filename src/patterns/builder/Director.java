package patterns.builder;

public class Director {

    public void constructorSportsCar(Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GpsNavigator());
    }

    public void constructorCityCar(Builder builder){
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GpsNavigator());
    }

    public void constructSUV(Builder builder){
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
    }
}
