package com.company;

public class Hamburger {

    private String breadRoll;
    private String meat;
    private String additionOne;
    private String additionTwo;
    private String additionThree;
    private String additionFour;
    private double price;

    public Hamburger(String breadRoll, String meat, String additionOne, String additionTwo, String additionThree, String additionFour) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.additionOne = additionOne;
        this.additionTwo = additionTwo;
        this.additionThree = additionThree;
        this.additionFour = additionFour;
    }

    public double setPrice() {
        double price = 0;
        price += getItemPrice(this.breadRoll);
        price += getItemPrice(this.meat);
        if (!this.additionOne.equals(""))
            price += getItemPrice(this.additionOne);
        if (!this.additionTwo.equals(""))
            price += getItemPrice(this.additionTwo);
        if (!this.additionThree.equals(""))
            price += getItemPrice(additionThree);
        if (!this.additionFour.equals(""))
            price += getItemPrice(additionFour);
        this.price = price;
        return price;
    }

    public double getItemPrice(String item) {
        switch (item.toLowerCase()) {
            case "beef":
                return 1.75;
            case "chicken":
            case "brown rye":
                return 1.25;
            case "angus":
                return 2.50;
            case "white":
                return .50;
            case "wheat":
            case "onion rings":
                return .75;
            case "cheese":
            case "chips":
                return 1.00;
            case "lettuce":
            case "tomato":
            case "pickles":
            case "onion":
            case "carrots":
                return .20;
            case "bacon":
            case "drink":
                return 1.50;
            case "avocado":
                return 1.30;
            case "":
                return 0;
        }
        return -1;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getAdditionOne() {
        return additionOne;
    }

    public String getAdditionTwo() {
        return additionTwo;
    }

    public String getAdditionThree() {
        return additionThree;
    }

    public String getAdditionFour() {
        return additionFour;
    }

    public double getPrice() {
        setPrice();
        return price;
    }
}
