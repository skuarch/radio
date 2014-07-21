package controllers.station;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import model.beans.Station;
import model.database.ModelSearch;
import model.database.ModelStations;
import model.logic.FoundStations;
import model.util.StringUtilities;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import model.logic.Searcher;

/**
 *
 * @author skuarch
 */
@Controller
public class Search {

    @Autowired
    private MessageSource messageSource;
    private static final Logger logger = Logger.getLogger(Search.class);
    private ArrayList<Station> stations = null;
    private ArrayList<Station> fs = new ArrayList<>();

    //==========================================================================
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView searchStations(@RequestParam("stringToSearch") String stringToSearch, ModelAndView mav, Locale locale) {

        Map chm = FoundStations.getFoundStations();
        Station s = null;        

        try {
            
            mav.setViewName("station/search");
            stringToSearch = StringUtilities.escapeString(stringToSearch);
            final String tmp = stringToSearch;

            //save search
            model.beans.Search search = new model.beans.Search();
            search.setText(stringToSearch);
            ModelSearch.saveSearch(search);

            //stringToSearch = stringToSearch.toLowerCase();
            stations = ModelStations.getActiveStations();

            stations.stream().forEach((station) -> {
                new Thread(() -> {                    
                    new Searcher(station, new String(tmp));
                }).start();
            });

            /*stations.stream().forEach((final Station station) -> {
             new Thread(new Searcher(station, stringToSearch)).start();
             });*/
            Thread.sleep(95);
            //System.out.println("found stations " + FoundStations.getFoundStations().size());            
            chm.keySet().stream().forEach((key) -> {
                fs.add((Station) chm.get(key));
            });

            mav.addObject("fs", fs);
            
        } catch (Exception e) {
            mav.addObject("js", "alertify.log('" + messageSource.getMessage("text4", null, locale) + "')");
            logger.error("search", e);
        } 

        return mav;
    }

} // end class
