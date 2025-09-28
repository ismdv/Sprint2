package service;
import model.Food;

public class ShoppingCart {

    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public Food[] getFood() {
        return food;
    }

    public void setFood(Food[] food) {
        this.food = food;
    }

    public double getSumm() {
        double sum = 0;
        for (Food food1 : food) {
            sum += food1.getAmount() * food1.getPrice();
        }
        return sum;
    }

    public double getSummWithDicount() {
        double sum = 0;
        for (Food food1 : food) {
            sum += food1.getAmount() * food1.getPrice() * (1-food1.getDiscount() / 100);
        }
        return sum;
    }

    public double getSummVeganWithDicount() {
        double sum = 0;
        for (Food food1 : food) {
            if (food1.isVegetarian() && food1.getDiscount() == 0) {
                sum += food1.getAmount() * food1.getPrice() ;
            }
        }
        return sum;
    }
}
