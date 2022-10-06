package com.company;

public class HealthyBurger extends Hamburger{

    private String additionFive;
    private String additionSix;
    private double price;

    public HealthyBurger(String meat, String additionOne, String additionTwo, String additionThree, String additionFour, String additionFive, String additionSix) {
        super("Brown Rye", meat, additionOne, additionTwo, additionThree, additionFour);
        this.additionFive = additionFive;
        this.additionSix = additionSix;
    }

    @Override
    public double setPrice() {
        double price = super.setPrice() + getItemPrice(additionFive) + getItemPrice(additionSix);
        this.price = price;
        return price;
    }

    public String getAdditionFive() {
        return additionFive;
    }

    public String getAdditionSix() {
        return additionSix;
    }

    @Override
    public double getPrice() {
        setPrice();
        return price;
    }
}
