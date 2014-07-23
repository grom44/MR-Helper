package lib;

import java.util.HashMap;

/**
 * Created by Sebastian on 2014-07-23.
 */
public class StringContainer {

    private HashMap<String, String> stringArray = new HashMap<String, String>();

    public StringContainer() {

        stringArray.put("menu_file","File");
        stringArray.put("menu_file_exit","Exit");
        stringArray.put("menu_options","Options");
    }

    public String getString(String key) {

        return stringArray.get(key);
    }
}
