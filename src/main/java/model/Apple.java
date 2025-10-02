package model;


import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.DISCOUNT_RED;

public class Apple extends Food {

    private String color;

    public Apple(int amount, double price,  String colour) {
        super(amount, price, true);
        this.color = colour;
    }

    @Override
    public double getDiscount() {
        if (COLOUR_RED.equalsIgnoreCase(color)) {
            return DISCOUNT_RED;
        } else {
            return 0;
        }

    }
}
