package jasmine.jragon.gtfsreborn.boundary;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static jasmine.jragon.gtfsreborn.boundary.Stop.StopLineSection.STOP_ID;
import static jasmine.jragon.gtfsreborn.boundary.StopTime.StopTimeLineSection.ARRIVAL_TIME;
import static jasmine.jragon.gtfsreborn.boundary.StopTime.StopTimeLineSection.DEPARTURE_TIME;
import static jasmine.jragon.gtfsreborn.boundary.StopTime.StopTimeLineSection.STOP_SEQUENCE;
import static jasmine.jragon.gtfsreborn.boundary.StopTime.StopTimeLineSection.TRIP_ID;

public class StopTime {
    private static final String TIME_FORMAT = "HH:mm:ss";

    private final String tripID, stopID, stopSequence;
    private final LocalTime arrivalTime, departureTime;

    public StopTime(String[] array) {
        tripID = array[TRIP_ID.ordinal()];
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern(TIME_FORMAT);
        arrivalTime = LocalTime.parse(array[ARRIVAL_TIME.ordinal()], timeFormat);
        departureTime = LocalTime.parse(array[DEPARTURE_TIME.ordinal()], timeFormat);
        stopID = array[STOP_ID.ordinal()];
        stopSequence = array[STOP_SEQUENCE.ordinal()];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StopTime stopTime)) return false;

        return tripID.equals(stopTime.tripID) && stopID.equals(stopTime.stopID) &&
                stopSequence.equals(stopTime.stopSequence) &&
                arrivalTime.equals(stopTime.arrivalTime) && departureTime.equals(stopTime.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripID, stopID, stopSequence, arrivalTime, departureTime);
    }

    enum StopTimeLineSection {
        TRIP_ID, ARRIVAL_TIME, DEPARTURE_TIME, STOP_ID, STOP_SEQUENCE, STOP_HEADSIGN, PICKUP_TYPE, DROP_OFF_TYPE
    }
}
