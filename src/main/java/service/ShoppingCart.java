package service;
import model.Food;

public class ShoppingCart {

    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getSum() {
        double sum = 0;
        for (Food food1 : food) {
            sum += food1.getAmount() * food1.getPrice();
        }
        return sum;
    }

    public double getSumWithDiscount() {
        double sum = 0;
        for (Food food1 : food) {
            sum += food1.getAmount() * food1.getPrice() * (1-food1.getDiscount() / 100);
        }
        return sum;
    }

    public double getSumVeganWithoutDiscount() {
        double sum = 0;
        for (Food food1 : food) {
            if (food1.isVegetarian()) {
                sum += food1.getAmount() * food1.getPrice() ;
            }
        }
        return sum;
    }
}
