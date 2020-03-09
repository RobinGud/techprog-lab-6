package ru.billing.client;

import ru.billing.stocklist.*;
import ru.billing.exceptions.*;

/**
 * Catalogloader
 */
public interface CatalogLoader {

    public void load(ItemCatalog itemCatalog) throws CatalogLoadException;
}