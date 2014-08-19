package controllers.station;

import java.util.ArrayList;
import java.util.Locale;
import model.beans.Station;
import model.database.ModelSearch;
import model.logic.Searcher;
import org.apache.commons.lang3.StringEscapeUtils;
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
public class Search {

    @Autowired
    private MessageSource messageSource;
    private static final Logger logger = Logger.getLogger(Search.class);
    private ArrayList<Station> stations = null;
    private String keywords = null;

    //==========================================================================
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView searchStations(@RequestParam("stringToSearch") String stringToSearch, ModelAndView mav, Locale locale) {

        try {

            //clean var
            keywords = StringEscapeUtils.escapeHtml4(stringToSearch);

            //save search            
            model.beans.Search search = new model.beans.Search();
            search.setText(keywords);
            saveSearch(search);

            //search keyword
            stations = new Searcher(keywords).searchStations();

            mav.addObject("fs", stations);

        } catch (Exception e) {
            mav.addObject("js", "alertify.log('" + messageSource.getMessage("text4", null, locale) + "')");
            logger.error("search", e);
        } finally {
            mav.setViewName("station/search");
        }

        return mav;
    }

    //==========================================================================
    private static void saveSearch(final model.beans.Search search) {

        new Thread(() -> {

            try {
                ModelSearch.saveSearch(search);
            } catch (Exception e) {
                logger.error("saveSearch", e);
            }

        }).start();

    } // end saveSearch

} // end class
