import model.Appple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food[] food = new Food[]{
                new Meat(5,100,false),
                new Appple(10,50,true,"red"),
                new Appple(8,60,true,"green"),
        };

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Общая стоимость товаров без скидки: " + shoppingCart.getSumm() + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + shoppingCart.getSummWithDicount() + " руб.");
        System.out.println("Общая стоимость вегетарианских продуктов без скидки: " + shoppingCart.getSummVeganWithDicount() + " руб.");

    }
}
