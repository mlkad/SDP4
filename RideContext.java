public class RideContext {
    private FareStrategy fareStrategy;

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public double calculateFare(double distance, double duration) {
        if (distance < 0 || duration < 0) {
            throw new IllegalArgumentException("Distance and duration must be non-negative.");
        }

        // Minimum charge for short-distance rides
        if (distance < 1) {
            return 5.00; // Minimum charge
        }

        return fareStrategy.calculateFare(distance, duration);
    }

    // Dynamically selects the appropriate strategy based on conditions
    public void selectStrategy(String condition) {
        switch (condition.toLowerCase()) {
            case "regular":
                setFareStrategy(new RegularFareStrategy());
                break;
            case "premium":
                setFareStrategy(new PremiumFareStrategy());
                break;
            case "discount":
                setFareStrategy(new DiscountFareStrategy());
                break;
            case "surge":
                setFareStrategy(new SurgeFareStrategy());
                break;
            default:
                throw new IllegalArgumentException("Invalid fare strategy.");
        }
    }
}
