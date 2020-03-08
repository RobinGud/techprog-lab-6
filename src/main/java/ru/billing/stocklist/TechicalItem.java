package ru.billing.stocklist;

/**
 * TechicalItem
 */
public class TechicalItem extends GenericItem {

    private short warrantyTime;

    public TechicalItem(int ID, String name, float price, GenericItem analogObj, Category category,
            short warrantyTime) {
        super(ID, name, price, analogObj, category);
        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %-20s, price: %5.2f, Category: %s, warranty time: %d \n", this.getID(),
                this.getName(), this.getPrice(), this.getCategory(), warrantyTime);
    }

    @Override
    public Object clone() {
        TechicalItem item = new TechicalItem(this.getID(), this.getName(), this.getPrice(), this.getAnalogObj(),
                this.getCategory(), this.warrantyTime);
        return item;
    }
}