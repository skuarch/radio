package model.servlet;

import java.util.ArrayList;
import java.util.Timer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import model.beans.Station;
import model.logic.StationTimer;
import org.apache.log4j.Logger;

/**
 *
 * @author skuarch
 */
@WebListener
public class ServletListener implements ServletContextListener {

    public static final Logger logger = Logger.getLogger(ServletListener.class);    
    private Timer timer = null;

    //==========================================================================
    public ServletListener() {
    }

    //==========================================================================
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        try {

            //start the stations array
            /*stations.addAll(ModelStations.getActiveStations());
            StationContainerManager.setStations(stations);            */
            
            //start timer to renew stations arrayList
            timer = new Timer();
            timer.scheduleAtFixedRate(new StationTimer(), 0, 1000 * 60 * 60);            

        } catch (Exception e) {
            logger.error("contextInitialized", e);
        }

    } // end contextInitialized

    //==========================================================================
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        timer.cancel();
        timer = null;

    } // end contextDestroyed

} // end class
