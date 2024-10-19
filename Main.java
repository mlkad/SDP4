public class Main {
    public static void main(String[] args) {
        RideContext rideContext = new RideContext();

        // Test Regular Fare Strategy
        rideContext.selectStrategy("regular");
        System.out.println("Regular Fare: $" + rideContext.calculateFare(10, 15)); // 10 km, 15 min

        // Test Premium Fare Strategy
        rideContext.selectStrategy("premium");
        System.out.println("Premium Fare: $" + rideContext.calculateFare(10, 15)); // 10 km, 15 min

        // Test Discount Fare Strategy
        rideContext.selectStrategy("discount");
        System.out.println("Discount Fare: $" + rideContext.calculateFare(10, 15)); // 10 km, 15 min

        // Test Surge Fare Strategy
        rideContext.selectStrategy("surge");
        System.out.println("Surge Fare: $" + rideContext.calculateFare(10, 15)); // 10 km, 15 min

        // Test minimum charge for short-distance rides
        System.out.println("Minimum Charge for Short Distance: $" + rideContext.calculateFare(0.5, 5)); // 0.5 km, 5 min

        // Test invalid input
        try {
            System.out.println("Invalid input: $" + rideContext.calculateFare(-10, 15)); // Negative distance
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
