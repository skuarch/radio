package model.logic;

import model.database.ModelStations;
import model.logic.container.StationContainerManager;
import java.util.TimerTask;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
public class StationTimer extends TimerTask {

    private static final Logger logger = Logger.getLogger(StationTimer.class);
    
    //==========================================================================
    public StationTimer() {
    }

    //==========================================================================
    @Override
    public void run() {
        
        try {
            
            logger.info("updating stations");
            StationContainerManager.setStations(ModelStations.getActiveStations());
            
        } catch (Exception ex) {
            logger.error(" error ", ex);
        }
        
    }

} // end class
