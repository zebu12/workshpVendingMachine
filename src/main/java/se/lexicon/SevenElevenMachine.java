package se.lexicon;

import se.lexicon.model.*;

public class SevenElevenMachine implements VendingMachine {

    private Product[] products;
    private int depositpool = 0;

    public SevenElevenMachine() {

        products = new Product[6];
        products[0] = new EnergyBar(1, 25.0, "KexBar", 15.0);
        products[1] = new EnergyBar(2, 30.0, "ChoKexBar", 15.0);
        products[2] = new ChipsBag(3, 40.0, "VikingsChips", "Dill");
        products[3] = new ChipsBag(4, 50.0, "ChoKexBar", "vitlök");
        products[4] = new SoftDrink(4, 35.0, "Pespi", 500.0);
        products[5] = new SoftDrink(5, 45.0, "Koke", 500.0);

    }


    @Override
    public void addCurrency(Currency amount) {
        depositpool += amount.getValue();

    }

    @Override
    public int getBalance() {
        return depositpool;
    }

    @Override
    public Product request(int id) {
        switch (id) {
            case 1:
                if (depositpool >= products[0].getPrice()) {
                    System.out.println(products[0].use());
                    depositpool -= products[0].getPrice();
                } else {
                    System.out.println("Add more money");
                }
                break;


            case 2:
                if (depositpool >= products[1].getPrice()) {
                    System.out.println(products[1].use());
                    depositpool -= products[1].getPrice();
                } else {
                    System.out.println("Add more money");
                }
                break;

            case 3:
                if (depositpool >= products[2].getPrice()) {
                    System.out.println(products[2].use());
                    depositpool -= products[2].getPrice();
                } else {
                    System.out.println("Add more money");
                }
                break;


            case 4:
                if (depositpool >= products[3].getPrice()) {
                    System.out.println(products[3].use());
                    depositpool -= products[3].getPrice();
                } else {
                    System.out.println("Add more money");
                }
                break;


            case 5:
                if (depositpool >= products[4].getPrice()) {
                    System.out.println(products[4].use());
                    depositpool -= products[4].getPrice();
                } else {
                    System.out.println("Add more money");
                }
                break;


            case 6:
                if (depositpool >= products[5].getPrice()) {
                    System.out.println(products[5].use());
                    depositpool -= products[5].getPrice();
                } else {
                    System.out.println("Add more money");
                }
                break;
            default:
                System.out.println("Product not found");
                break;

        }

        return null;
    }

    @Override
    public int endSession() {
        int remainingBalance = depositpool;
        System.out.println("Returning " + remainingBalance+"Kr.");
        depositpool = 0;

        return remainingBalance;
    }

    @Override
    public String getDescription(int id) {
        switch (id) {
            case 1:
                products[0].examine();
                break;
            case 2:
                products[1].examine();
                break;
            case 3:
                products[2].examine();
                break;
            case 4:
                products[3].examine();
                break;
            case 5:
                products[4].examine();
                break;
            case 6:
                products[5].examine();
                break;
            default:
                System.out.println("Product not found");
                break;
        }


        return "";
    }

    @Override
    public String[] getProducts() {

        String[] prods = new String[6];
        prods[0] = products[0].examine();
        prods[1] = products[1].examine();
        prods[2] = products[2].examine();
        prods[3] = products[3].examine();
        prods[4] = products[4].examine();
        prods[5] = products[5].examine();
        //prods[6] = products[6].examine();

        return prods;
    }


//    @Override
//    public String[] getProducts() {
//
//        String[] prods = new String[6];
//        prods[0] = products[0].examine();
//        prods[1] = products[1].examine();
//        prods[2] = products[2].examine();
//        prods[3] = products[3].examine();
//        prods[4] = products[4].examine();
//        prods[5] = products[5].examine();
//        prods[6] = products[6].examine();
//
//
//        return prods;
//    }
}
