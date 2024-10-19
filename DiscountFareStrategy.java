public class DiscountFareStrategy implements FareStrategy {
    private static final double DISCOUNT_RATE = 0.80; // 20% discount

    @Override
    public double calculateFare(double distance, double duration) {
        double regularFare = new RegularFareStrategy().calculateFare(distance, duration);
        return regularFare * DISCOUNT_RATE;
    }
}
