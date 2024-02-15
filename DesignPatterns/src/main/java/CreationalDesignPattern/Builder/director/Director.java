package CreationalDesignPattern.Builder.director;

import CreationalDesignPattern.Builder.builders.Builder;
import CreationalDesignPattern.Builder.cars.CarType;
import CreationalDesignPattern.Builder.components.Engine;
import CreationalDesignPattern.Builder.components.GPSNavigator;
import CreationalDesignPattern.Builder.components.Transmission;
import CreationalDesignPattern.Builder.components.TripComputer;

/**
 * The type Director.
 */
public class Director {

    /**
     * Construct sports car.
     *
     * @param builder the builder
     */
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    /**
     * Construct city car.
     *
     * @param builder the builder
     */
    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    /**
     * Construct suv.
     *
     * @param builder the builder
     */
    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
