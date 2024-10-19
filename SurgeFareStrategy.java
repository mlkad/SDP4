public class SurgeFareStrategy implements FareStrategy {
    private static final double SURGE_MULTIPLIER = 2.0;

    @Override
    public double calculateFare(double distance, double duration) {
        double regularFare = new RegularFareStrategy().calculateFare(distance, duration);
        return regularFare * SURGE_MULTIPLIER;
    }
}
