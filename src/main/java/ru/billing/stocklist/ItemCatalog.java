package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ItemCatalog
 */

public class ItemCatalog {

    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public void addItem(GenericItem item) {
        catalog.put(item.getID(), item);
        ALCatalog.add(item);
    }

    public GenericItem findItemByID(int id) {
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem genericItem : ALCatalog) {
            if (genericItem.getID() == id)
                return genericItem;
        }
        return null;
    }
}