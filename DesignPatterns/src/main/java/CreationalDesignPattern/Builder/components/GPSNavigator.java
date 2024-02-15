package CreationalDesignPattern.Builder.components;

/**
 * The type Gps navigator.
 */
public class GPSNavigator {
    /**
     * The Route.
     */
    private String route;

    /**
     * Instantiates a new Gps navigator.
     */
    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    /**
     * Instantiates a new Gps navigator.
     *
     * @param manualRoute the manual route
     */
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    /**
     * Gets route.
     *
     * @return the route
     */
    public String getRoute() {
        return route;
    }
}
