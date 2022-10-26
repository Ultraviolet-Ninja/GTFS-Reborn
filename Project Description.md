# GTFS Reborn

## File Layout
### Stops
*Unique Identifier:*
- stop_id
    - **Required Field**
- stop_name
- stop_desc
- stop_lat
    - **Required Field**
- stop_lon
    - **Required Field**


### Stop Times
*Unique Identifier:*
- trip_id
    - **Required Field**
- arrival_time
    - **Required Field**
- departure_time
    - **Required Field**
- stop_id
    - **Required Field**
- stop_sequence
- stop_headsign
- pickup_type
- drop_off_type


### Routes
*Unique Identifier:*
- route_id
    - **Required Field**
- agency_id
- route_short_name
- route_long_name
- route_desc
- route_type
- route_url
- route_color
    - **Required Field**
- route_text_color


### Trips
*Unique Identifier:*
- route_id
    - **Required Field**
- service_id
- trip_id
- trip_headsign
- direction_id
- block_id
- shape_id

## Functionality Outline
1. Import a set of GTFS files into the program
    - stops.txt
    - trips.txt
    - stop_times.txt
    - routes.txt

2. Display the distance of each trip

3. Display the average speed based on the start and end times of a trip

4. Display the number of trips each stop is found on.

5. Search for a <u>stop</u> by ***stop_id*** and display all ***route_id***(s) that contain the stop

6. Search for a <u>route</u> by ***route_id*** and display all the ***stop_id***(s) on the route

7. Search for a <u>route</u> by ***route_id*** and display the ***trip_id*** for any trips happening in the future

8. Search for a <u>stop</u> by ***stop_id*** and display the next trip_id(s) (*closest to the current time*)

9. Plot the GPS coordinates for all the stops on a given route on a Google map (static is OK)
    - Different routes should be different colors
    - A legend should be shown

10. Plot the current location of any bus on any route inferred from the timing in the trips

11. Update any attributes of a stop_time, stop, route, or trip

12. Update any attributes of a group of stop_times simultaneously
    - Attributes of a trip should be possible to apply to “all similar trips”

13. Click and drag a stop on a route to change the stop location a. Note: This should apply the change to all trips using the stop

14. Click on a stop and change the times that the individual trips arrive and depart at the stop

15. Export the GTFS files in the correct format from the data structure
    - stops.txt
    - trips.txt
    - stop_times.txt
    - routes.txt
## Front-End Design
- Alerts to signify imports and exports (*whether good or bad*)
- Tab Pane
    - File Tab
        - Import/Export functionality
    - Search Tab
      - 
    - View Tab
      - 


## Back-End Design
### Basic Classes
- FXML File
- Controller
- GTFSDataLake
- Stop
- StopTime
- Route
- Trip
- Location
- Import/ExportUtils

### Data Structures
- Hash Maps (Possibly Linked)
- Array Lists
