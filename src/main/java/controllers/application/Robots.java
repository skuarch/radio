package controllers.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author skuarch
 */
@Controller
public class Robots {

    @RequestMapping(value = "/robots.txt")
    public @ResponseBody String robot() {
        return "User-agent: *\n"
                + "Allow: /";
    }

}
