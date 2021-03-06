package controllers.station;

import java.util.ArrayList;
import java.util.Locale;
import model.beans.Station;
import model.database.ModelStations;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class StationsByOrder {

    @Autowired
    private MessageSource messageSource;
    private static final Logger logger = Logger.getLogger(StationsByOrder.class);    

    //==========================================================================
    @RequestMapping(value = "/stationsByOrder")
    public ModelAndView getStationsByOrder(ModelAndView mav, Locale locale) {
        
        ArrayList<Station> stations;
        
        try {

            mav.setViewName("station/stationsByOrder");            
            stations = ModelStations.getStationsByOrder("desc", 18);            
            mav.addObject("stations", stations);
            
        } catch (Exception e) {
            mav.addObject("js", "alertify.log('" + messageSource.getMessage("text4", null, locale) + "')");
            logger.error("stationsByOrder", e);
        }

        return mav;
    }

} // end class
