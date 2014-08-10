package controllers.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class AdBlocker {
    
    @RequestMapping(value = "/adblocker")
    public ModelAndView adBlocker(ModelAndView mav){
        
        mav.setViewName("application/adblocker");
        return mav;
        
    }
    
} // end class
