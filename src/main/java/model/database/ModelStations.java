package model.database;

import java.util.ArrayList;
import java.util.HashMap;
import model.beans.Station;

/**
 * business logic for Station.
 *
 * @author skuarch
 */
public class ModelStations {

    //==========================================================================
    /**
     * this class doesn't need a public constructor.
     */
    private ModelStations() {
    } // end ModelStations

    //==========================================================================
    public static Station getStation(long id) throws Exception {

        Station s = new DAO().get(id, new Station());

        return s;
    }

    //==========================================================================    
    public static ArrayList<Station> getStations(int start, int maxResults) throws Exception {

        ArrayList<Station> arrayList = new DAO().queryLimit("getStations", new Station(), start, maxResults);

        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }

        return arrayList;

    } // end getStations

    //==========================================================================
    public static Station getStationByName(String stationName) throws Exception {

        if (stationName == null || stationName.length() < 1) {
            throw new NullPointerException("stationName is null");
        }

        Station station = null;
        ArrayList<Station> stations = null;
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", stationName);
        stations = new DAO().query(hm, "getStationByName", new Station());

        if (stations == null || stations.size() < 1 || stations.get(0) == null) {
            station = null;
        } else {
            station = stations.get(0);
        }

        return station;

    } // end getStationByName

    //==========================================================================
    public static void updateStation(Station station) throws Exception {

        if (station == null) {
            throw new NullPointerException("station is null");
        }

        new DAO().update(station);

    } // end updateStation

    //==========================================================================
    public static ArrayList<Station> getStationsByClick(String order, int maxResults) throws Exception {

        if (order == null || order.length() < 1) {
            throw new NullPointerException("order is null");
        }

        ArrayList<Station> stations = null;
        stations = (ArrayList<Station>) new DAO().hql(new Station(), "from Station s where s.active = 1 order by s.clicks " + order, maxResults);

        if (stations == null || stations.size() < 1 || stations.get(0) == null) {
            stations = new ArrayList<Station>();
        }

        return stations;

    } // end getStationsByClick

    //==========================================================================
    public static ArrayList<Station> getStationsByOrder(String order, int maxResults) throws Exception {

        if (order == null || order.length() < 1) {
            throw new NullPointerException("order is null");
        }

        ArrayList<Station> stations = null;
        stations = (ArrayList<Station>) new DAO().hql(new Station(), "from Station s where s.active = 1 order by s.id " + order, maxResults);

        if (stations == null || stations.size() < 1 || stations.get(0) == null) {
            stations = new ArrayList<Station>();
        }

        return stations;

    } // end getStationsByOrder

    //==========================================================================
    public static ArrayList<Station> getStationsByPosition(String order, int maxResults) throws Exception {

        if (order == null || order.length() < 1) {
            throw new NullPointerException("order is null");
        }

        ArrayList<Station> stations = null;
        //stations = (ArrayList<Station>) new DAO().hql(new Station(), "from Station s where s.active = 1 order by s.position " + order, maxResults);
        stations = (ArrayList<Station>) new DAO().orderCriteria(new Station(), maxResults, "position", order);
       
        if (stations == null || stations.size() < 1 || stations.get(0) == null) {
            stations = new ArrayList<Station>();
        }

        return stations;

    } // end getStationsByPosition

    //==========================================================================
    public static ArrayList<Station> getActiveStations() throws Exception {

        ArrayList<Station> stations = new DAO().query(new Station(), "getActiveStations",true);

        if (stations == null || stations.size() < 1 || stations.get(0) == null) {
            stations = new ArrayList<>();
        }

        return stations;
    }
} // end class
