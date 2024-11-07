package se.lexicon.model;

public class ChipsBag extends Product {

    private String flavor;

    public ChipsBag(int id, double price, String productName, String flavor) {
        super(id, price, productName);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", Price: " + getPrice() + ", ProductName: " + getProductName() + ", Flavor: " + getFlavor();
    }

    @Override
    public String use() {
        return "Enjoy your chips bag" + getFlavor();
    }
}
