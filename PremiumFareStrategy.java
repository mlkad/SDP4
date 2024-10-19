public class PremiumFareStrategy implements FareStrategy {
    private static final double RATE_PER_KM = 2.00;
    private static final double RATE_PER_MINUTE = 0.50;

    @Override
    public double calculateFare(double distance, double duration) {
        return (RATE_PER_KM * distance) + (RATE_PER_MINUTE * duration);
    }
}
