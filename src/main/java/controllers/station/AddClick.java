package controllers.station;

import model.beans.Station;
import model.database.ModelStations;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class AddClick {

    private static final Logger logger = Logger.getLogger(AddClick.class);

    //==========================================================================
    @RequestMapping(value = "/addClick")
    @ResponseBody
    public void addClick(@RequestParam("g") String g, ModelAndView mav) {

        Station station = null;

        try {

            g = StringEscapeUtils.escapeJava(g);
            station = ModelStations.getStationByName(g);
            station.setClicks(station.getClicks() + 1);
            ModelStations.updateStation(station);

        } catch (Exception e) {
            logger.error("addClick", e);
        }
        
    }

} // end class
