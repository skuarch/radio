package model.logic;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import model.beans.Station;
import model.logic.container.StationContainerManager;

/**
 *
 * @author skuarch
 */
public class Searcher {

    private String keywords = null;    

    //==========================================================================
    /**
     * construct.
     *
     * @param keywords String
     */
    public Searcher(String keywords) {
        this.keywords = keywords;
    } // end Search

    //==========================================================================
    /**
     * search station
     *
     * @return ArrayList<Station>
     */
    public ArrayList<Station> searchStations() {

        ArrayList<Station> stations = null;
        ArrayList<Station> foundStations = new ArrayList<>(200);

        try {

            keywords = keywords.toLowerCase();
            stations = StationContainerManager.getStations();

            foundStations = stations
                    .stream()
                    .filter(stationsPredicate)
                    .collect(Collectors.toCollection(() -> new ArrayList<Station>()));

        } catch (Exception e) {
            throw e;
        }

        return foundStations;

    } // end searchStations

    private final Predicate<Station> stationsPredicate = s -> s.getKeywords().contains(keywords);
    
} // end class
