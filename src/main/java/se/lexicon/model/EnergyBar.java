package se.lexicon.model;

public class EnergyBar extends Product {

    private double weight;


    public EnergyBar(int id, double price, String productName, double weight) {
        super(id, price, productName);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", Price: " + getPrice() + ", Product: " + getProductName() + ", Weight: " + getWeight();
    }

    @Override
    public String use() {
        return "Enjoy your energy bar!" + getProductName() + ", Weight: " + getWeight();
    }
}
