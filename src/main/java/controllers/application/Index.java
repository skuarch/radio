package controllers.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring Controller.
 * @author skuarch
 */
@Controller
public class Index {
   
    //==========================================================================
    @RequestMapping(value = {"","/","/index","/hoyradio","/hoyradio/index"}, method = RequestMethod.GET)
    public ModelAndView index(){        
       
        return new ModelAndView("index");
        
    } // end 
    
    
} // end class
