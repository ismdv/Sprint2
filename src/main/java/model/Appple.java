package model;


import static model.constants.Colour.COLOUR_1;
import static model.constants.Discount.DISCOUNT_1;

public class Appple extends Food {

    String color;

    public Appple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.color = colour;
    }

    @Override
    public double getDiscount() {
        if (COLOUR_1.equalsIgnoreCase(color)) {
            return DISCOUNT_1;
        } else {
            return 0;
        }

    }
}
