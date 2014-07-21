package model.database;

import model.beans.Search;
import model.database.DAO;

/**
 *
 * @author skuarch
 */
public class ModelSearch {

    //==========================================================================
    private ModelSearch() {
    }    
    
    //==========================================================================
    public static void saveSearch(Search search) throws Exception {

        if (search == null) {
            throw new IllegalArgumentException("search is null");
        }

        new DAO().create(search);

    }

}
