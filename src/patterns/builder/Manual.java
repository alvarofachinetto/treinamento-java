package patterns.builder;

public class Manual {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public StringBuilder print() {
        StringBuilder builder = new StringBuilder();

        builder.append("Type of car: " + type + "\n")
                .append("Count of seats: " + seats + "\n")
                .append("Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n")
                .append("Transmission: " + transmission + "\n");

                if(this.tripComputer != null)
                    builder.append("Trip Computer: Functional" + "\n");
                else
                    builder.append("Trip Computer: N/A" + "\n");
                if (this.gpsNavigator != null)
                    builder.append("GPS Navigator: Functional" + "\n");
                else
                    builder.append("GPS Navigator: N/A" + "\n");

        return builder;
    }
}
