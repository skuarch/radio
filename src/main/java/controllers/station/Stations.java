package controllers.station;

import java.util.ArrayList;
import java.util.Locale;
import model.beans.Station;
import model.logic.container.StationContainerManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class Stations {

    @Autowired
    private MessageSource messageSource;
    private static final Logger logger = Logger.getLogger(Stations.class);    

    //==========================================================================
    @RequestMapping(value = "/stations", method = RequestMethod.POST)
    public ModelAndView getStations(@RequestParam("start") int start, @RequestParam("maxResults") int maxResults, ModelAndView mav, Locale locale) {

        ArrayList<Station> stations;

        try {

            
            stations = StationContainerManager.getStationsLimit(start, start + maxResults);
            mav.setViewName("station/stations");
            mav.addObject("stations", stations);
            
        } catch (Exception e) {
            mav.addObject("js", "alertify.log('" + messageSource.getMessage("text4", null, locale) + "')");
            logger.error("stations", e);
        }

        return mav;

    }

}
