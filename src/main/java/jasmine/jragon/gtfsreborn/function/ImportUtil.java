package jasmine.jragon.gtfsreborn.function;

import java.io.File;
import java.util.List;

public class ImportUtil {
    private static final String STOP_FILE_HEADER = "stop_id,stop_name,stop_desc,stop_lat,stop_lon",
            TRIP_FILE_HEADER = "route_id,service_id,trip_id,trip_headsign,direction_id,block_id,shape_id",
            ROUTE_FILE_HEADER =
            "route_id,agency_id,route_short_name,route_long_name,route_desc,route_type,route_url,route_color,route_text_color",
            STOP_TIME_FILE_HEADER =
            "trip_id,arrival_time,departure_time,stop_id,stop_sequence,stop_headsign,pickup_type,drop_off_type";

    public static void importAllFiles(List<File> files) throws IllegalArgumentException {
        if (files.size() != 4) {
            throw new IllegalArgumentException();
        }
    }
}
