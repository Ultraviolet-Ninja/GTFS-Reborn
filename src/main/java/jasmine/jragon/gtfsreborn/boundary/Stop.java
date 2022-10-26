package jasmine.jragon.gtfsreborn.boundary;

import static jasmine.jragon.gtfsreborn.boundary.Stop.StopLineSection.STOP_DESC;
import static jasmine.jragon.gtfsreborn.boundary.Stop.StopLineSection.STOP_ID;
import static jasmine.jragon.gtfsreborn.boundary.Stop.StopLineSection.STOP_LATITUDE;
import static jasmine.jragon.gtfsreborn.boundary.Stop.StopLineSection.STOP_LONGITUDE;
import static jasmine.jragon.gtfsreborn.boundary.Stop.StopLineSection.STOP_NAME;

public class Stop {
    private final String stopID, stopName, stopDesc;
    private final Location location;
    public Stop(String[] array) {
        stopID = array[STOP_ID.ordinal()];
        stopName = array[STOP_NAME.ordinal()];
        stopDesc = array[STOP_DESC.ordinal()];
        location = new Location(
                Double.parseDouble(array[STOP_LATITUDE.ordinal()]),
                Double.parseDouble(array[STOP_LONGITUDE.ordinal()])
        );
    }

    public double distanceInKilometers(Stop otherStop) {
        return location.calculateDistanceToKilometers(otherStop.location);
    }

    public double distanceInMiles(Stop otherStop) {
        return location.calculateDistanceToMiles(otherStop.location);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Stop stop)) {
            return false;
        }

        return stopID.equals(stop.stopID);
    }

    @Override
    public int hashCode() {
        return stopID.hashCode();
    }

    @Override
    public String toString() {
        return String.format("StopID: %s\nLocation: %s", stopID, location);
    }

    enum StopLineSection {
        STOP_ID, STOP_NAME, STOP_DESC, STOP_LATITUDE, STOP_LONGITUDE
    }
}
