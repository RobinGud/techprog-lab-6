package ru.billing.stocklist;

import java.util.Date;

/**
 * FoodItem
 */
public class FoodItem extends GenericItem {

    private Date DateOfIncome;
    private short expires;

    public Date getDateOfIncome() {
        return this.DateOfIncome;
    }

    public void setDateOfIncome(Date DateOfIncome) {
        this.DateOfIncome = DateOfIncome;
    }

    public short getExpires() {
        return this.expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public FoodItem(int ID, String name, float price, GenericItem analogObj, Category category, Date DateOfIncome,
            short expires) {
        super(ID, name, price, analogObj, category);
        this.DateOfIncome = DateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, GenericItem analogObj, Date DateOfIncome, short expires) {
        super(name, price, analogObj);
        this.DateOfIncome = DateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, Category category, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, 0f, null, null, (short) 32);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %-20s, price: %5.2f, Category: %s, date of income: %s, expires: %d \n",
                getID(), this.getName(), this.getPrice(), this.getCategory(), DateOfIncome, expires);
    }

    @Override
    public Object clone() {
        FoodItem item = new FoodItem(this.getID(), this.getName(), this.getPrice(), this.getAnalogObj(),
                this.getCategory(), this.DateOfIncome, this.expires);
        return item;
    }
}