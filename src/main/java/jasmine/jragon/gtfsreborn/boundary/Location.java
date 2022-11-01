package jasmine.jragon.gtfsreborn.boundary;

public record Location(double latitude, double longitude) {
    private static final double EARTH_RADIUS_KM = 6378.137, EARTH_RADIUS_MI = 3963.1905919;

    /**
     * Gives the distance between the current location and a
     * given start/endpoint. This uses Haversine's formula to calculate the distance
     * between two points on a given spherical object using its radius.
     *
     * @param otherLocation The location being compared to with the current location
     * @return The distance in miles
     */
    public double calculateDistanceToMiles(Location otherLocation){
        if (this.latitude == otherLocation.latitude && this.longitude == otherLocation.longitude) {
            return 0;
        }

        return calculateDistance(this, otherLocation) * EARTH_RADIUS_MI;
    }

    /**
     * Gives the distance between the current location and a
     * given start/endpoint. This uses Haversine's formula to calculate the distance
     * between two points on a given spherical object using its radius.
     *
     * @param otherLocation The location being compared to with the current location
     * @return The distance in kilometers
     */
    public double calculateDistanceToKilometers(Location otherLocation) {
        if (this.equals(otherLocation)) {
            return 0;
        }

        return calculateDistance(this, otherLocation) * EARTH_RADIUS_KM;
    }

    private static double calculateDistance(Location firstLocation, Location secondLocation) {
        double diffLat = Math.toRadians(firstLocation.latitude - secondLocation.latitude),
                diffLong = Math.toRadians(firstLocation.longitude - secondLocation.longitude);

        double haversineA = Math.pow(Math.sin(diffLat/2), 2) +
                Math.cos(Math.toRadians(firstLocation.latitude)) *
                        Math.cos(Math.toRadians(secondLocation.latitude)) *
                        Math.pow(Math.sin(diffLong/2), 2);

        return 2 * Math.atan2(Math.sqrt(haversineA),
                Math.sqrt(1 - haversineA));
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", latitude, longitude);
    }
}
