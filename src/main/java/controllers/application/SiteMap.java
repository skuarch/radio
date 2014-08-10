package controllers.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author skuarch
 */
@Controller
public class SiteMap {

    @RequestMapping(value = "/sitemap.xml")
    public @ResponseBody
    String sitemap() {

        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<urlset\n"
                + "      xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\"\n"
                + "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
                + "      xsi:schemaLocation=\"http://www.sitemaps.org/schemas/sitemap/0.9\n"
                + "            http://www.sitemaps.org/schemas/sitemap/0.9/sitemap.xsd\">\n"
                + "\n"
                + "<url>\n"
                + "  <loc>http://hoyradio.com/</loc>\n"
                + "  <changefreq>monthly</changefreq>\n"
                + "</url>\n"
                + "<url>\n"
                + "  <loc>http://hoyradio.com/hoyradio/index.html?lang=es</loc>\n"
                + "  <changefreq>monthly</changefreq>\n"
                + "</url>\n"
                + "<url>\n"
                + "  <loc>http://hoyradio.com/hoyradio/index.html?lang=en</loc>\n"
                + "  <changefreq>monthly</changefreq>\n"
                + "</url>\n"
                + "</urlset>";

    }

} // end class
