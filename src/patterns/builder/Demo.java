package patterns.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructorSportsCar(carBuilder);


        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructorSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();

        System.out.println("\nCar manual built:\n" + manual.print());



    }
}
