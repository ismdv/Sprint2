import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food[] food = new Food[]{
                new Meat(5,100),
                new Apple(10,50,"red"),
                new Apple(8,60,"green"),
        };

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Общая стоимость товаров без скидки: " + shoppingCart.getSum() + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + shoppingCart.getSumWithDiscount() + " руб.");
        System.out.println("Общая стоимость вегетарианских продуктов без скидки: " + shoppingCart.getSumVeganWithoutDiscount() + " руб.");

    }
}
