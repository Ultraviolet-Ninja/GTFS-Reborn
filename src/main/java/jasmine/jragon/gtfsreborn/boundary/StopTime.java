package jasmine.jragon.gtfsreborn.boundary;

public class StopTime {
    private static final String TIME_FORMAT = "HH:mm:ss";


    public StopTime(String[] array) {

    }

    enum StopTimeLineSection {
        TRIP_ID, ARRIVAL_TIME, DEPARTURE_TIME, STOD_ID, STOP_SEQUENCE, STOP_HEADSIGN, PICKUP_TYPE, DROP_OFF_TYPE
    }
}
