package ru.billing.client;

import ru.billing.exceptions.*;
import ru.billing.stocklist.*;
import java.util.Date;

/**
 * CatalogStubLoader
 */
public class CatalogStubLoader implements CatalogLoader {

    @Override
    public void load(ItemCatalog itemCatalog) throws CatalogLoadException {
        try {
            GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
            FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short) 10);
            itemCatalog.addItem(item1);
            itemCatalog.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException();
        }
    }
}