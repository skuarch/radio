package model.util;

import org.apache.commons.lang.StringEscapeUtils;

/**
 *
 * @author skuarch
 */
public class StringUtilities {

    //==========================================================================    
    /**
     * escape string 
     * @param string
     * @return String
     */
    public static String escapeString(String string) {

        string = StringEscapeUtils.escapeJava(string);
        string = StringEscapeUtils.escapeHtml(string);
        string = StringEscapeUtils.escapeJavaScript(string);
        
        return string;

    } // end escapeString

} // end class
