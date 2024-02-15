package CreationalDesignPattern.Builder.builders;

import CreationalDesignPattern.Builder.cars.CarType;
import CreationalDesignPattern.Builder.components.Engine;
import CreationalDesignPattern.Builder.components.GPSNavigator;
import CreationalDesignPattern.Builder.components.Transmission;
import CreationalDesignPattern.Builder.components.TripComputer;

/**
 * The interface Builder.
 */
public interface Builder {
    /**
     * Sets car type.
     *
     * @param type the type
     */
    void setCarType(CarType type);

    /**
     * Sets seats.
     *
     * @param seats the seats
     */
    void setSeats(int seats);

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    void setEngine(Engine engine);

    /**
     * Sets transmission.
     *
     * @param transmission the transmission
     */
    void setTransmission(Transmission transmission);

    /**
     * Sets trip computer.
     *
     * @param tripComputer the trip computer
     */
    void setTripComputer(TripComputer tripComputer);

    /**
     * Sets gps navigator.
     *
     * @param gpsNavigator the gps navigator
     */
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
