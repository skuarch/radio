package controllers.station;

import javax.ws.rs.QueryParam;
import model.beans.Station;
import model.database.ModelStations;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class GetStation {

    private static final Logger logger = Logger.getLogger(GetStation.class);

    @RequestMapping(value = "/getStation", method = RequestMethod.GET)
    public @ResponseBody String getStation(@QueryParam("id") int id) {

        String json = null;        
        Station s = null;

        try {

            s = ModelStations.getStation(id);
            
            if(s == null){
                json = "{}";
            }else{
                json = new JSONObject(s).toString();
            }
            

        } catch (Exception e) {
            logger.error("getStation", e);
        }

        return json;

    }

} // end class
