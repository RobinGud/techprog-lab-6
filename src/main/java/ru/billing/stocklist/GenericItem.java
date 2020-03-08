package ru.billing.stocklist;

/**
 * GenericItem
 */
public class GenericItem {

    private int ID;
    private String name;
    private float price;
    private GenericItem analogObj;
    private Category category = Category.GENERAL;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalogObj() {
        return this.analogObj;
    }

    public void setAnalogObj(GenericItem analogObj) {
        this.analogObj = analogObj;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    static int currentID = 0;

    public GenericItem(int ID, String name, float price, GenericItem analogObj, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.analogObj = analogObj;
        this.category = category;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analogObj) {
        this(name, price, Category.GENERAL);
        this.analogObj = analogObj;
    }

    public GenericItem() {
        this("Untitled", 0f, Category.GENERAL);
    }

    public void printAll() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %-20s, price: %5.2f, Category: %s \n", ID, name, price, category);
    }

    @Override
    public boolean equals(Object O) {
        if (this == O)
            return true;
        if (O == null)
            return false;
        if (getClass() != O.getClass())
            return false;
        String str1 = this.toString();
        String str2 = O.toString();
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Object clone() {
        GenericItem item = new GenericItem(this.analogObj.ID, this.analogObj.name, this.analogObj.price,
                this.analogObj.analogObj, this.analogObj.category);
        return item;
    }
}