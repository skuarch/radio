package model.logic.container;

import java.util.ArrayList;
import model.beans.Station;

/**
 *
 * @author skuarch
 */
public class StationContainer {

    private static ArrayList<Station> stations = new ArrayList<>(200);

    //==========================================================================
    private StationContainer() {
    } // end StationContainer

    //==========================================================================
    protected static ArrayList<Station> getStations() {
        return stations;
    }

    //==========================================================================
    protected static void setStations(ArrayList<Station> s) {
        stations.clear();
        stations = s;
    }

} // end class
