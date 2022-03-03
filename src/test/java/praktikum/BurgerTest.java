package praktikum;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BurgerTest {
    @Test
    public void checkBurgerPrice() {
        Database database = new Database();
        Burger burger = new Burger();
        List<Bun> buns = database.availableBuns();
        List<Ingredient> ingredients = database.availableIngredients();
        burger.setBuns(buns.get(0));
        burger.addIngredient(ingredients.get(1));
        burger.addIngredient(ingredients.get(4));
        float expectedPrice = 600;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
        }

    @Test
    public void checkRemoveIngredient() {
        Database database = new Database();
        Burger burger = new Burger();
        List<Bun> buns = database.availableBuns();
        List<Ingredient> ingredients = database.availableIngredients();
        burger.setBuns(buns.get(0));
        burger.addIngredient(ingredients.get(0));
        burger.addIngredient(ingredients.get(3));
        burger.addIngredient(ingredients.get(4));
        burger.removeIngredient(2);
        float expectedPrice = 400;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
    }

    @Test
    public void checkMoveIngredient() {
        Database database = new Database();
        Burger burger = new Burger();
        List<Ingredient> ingredients = database.availableIngredients();
        Ingredient hotSauce = ingredients.get(0);
        Ingredient cutlet = ingredients.get(3);
        burger.addIngredient(hotSauce); // index will be 0
        burger.addIngredient(cutlet); // index will be 1
        burger.moveIngredient(0, 1); // removed hotSauce
        int expectedIndexOfTheCutlet = 0;
        int actualIndexOfTheCutlet = burger.ingredients.indexOf(cutlet);
        assertEquals(expectedIndexOfTheCutlet, actualIndexOfTheCutlet);
    }

    @Test
    public void getReceipt() {
        Database database = new Database();
        Burger burger = new Burger();
        List<Bun> buns = database.availableBuns();
        List<Ingredient> ingredients = database.availableIngredients();
        burger.setBuns(buns.get(0));
        burger.addIngredient(ingredients.get(0));
        burger.addIngredient(ingredients.get(3));
        assertTrue("В строке не найдены слова: black bun, sauce hot sauce, filling cutlet, Price", burger.getReceipt().contains("black bun") && burger.getReceipt().contains("sauce hot sauce") && burger.getReceipt().contains("Price"));
    }

}

