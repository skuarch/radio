package model.logic.container;

import java.util.ArrayList;
import java.util.List;
import model.beans.Station;

/**
 * logic for StationContainer
 * @author skuarch
 */
public class StationContainerManager {
    
    private static final ArrayList<Station> stations = StationContainer.getStations();
    
    //==========================================================================
    private StationContainerManager(){
    
    }
    
    //==========================================================================
    public static void addStation(Station station) {

        if (station == null) {

            throw new IllegalArgumentException("station is null");

        } else {

            stations.add(station);

        }

    }

    //==========================================================================
    public static void removeStation(Station station) {

        if (station == null) {

            throw new IllegalArgumentException("station is null");

        } else {

            stations.remove(station);

        }

    }

    //==========================================================================
    public static ArrayList<Station> getStations() {
        return stations;
    }

    //==========================================================================
    public static void setStations(ArrayList<Station> s) {

        if (stations == null) {

            throw new IllegalArgumentException("stations is null");

        } else {

            stations.clear();
            stations.addAll(s);

        }

    }

    //==========================================================================
    public static ArrayList<Station> getStationsLimit(int start, int end) {

        ArrayList<Station> arrayList = new ArrayList<>();
        int listSize = stations.size();

        if (start > listSize || end > listSize) {            
            
            return arrayList;
            
        } else {
            
            List<Station> s = stations.subList(start, end);
            arrayList = new ArrayList<>(s);
            
        }
        
        return arrayList;

    }
    
} // end class
