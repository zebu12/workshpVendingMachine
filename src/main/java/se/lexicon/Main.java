package se.lexicon;

import se.lexicon.model.Currency;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");


        SevenElevenMachine machine = new SevenElevenMachine();
        machine.addCurrency(Currency.FIFTY);
        System.out.println(machine.getBalance());
        machine.request(2);
        System.out.println("--------------");
        System.out.println(machine.getBalance());
        machine.endSession();
        System.out.println(machine.getBalance());
        String[] items = machine.getProducts();
        for (String element : items) {
            System.out.println(element);
        }
    }


}
