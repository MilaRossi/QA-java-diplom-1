package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    @Test
    public void checkName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "name", 44);
        String expectedName = "name";
        String actualName = ingredient.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void checkType() {
        Ingredient ingredient = new Ingredient(IngredientType.valueOf("SAUCE"), "name", 44);
        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredient.getType();
        assertEquals(expectedType, actualType);
    }

    @Test
    public void checkPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "name", 44);
        float expectedPrice = 44;
        float actualPrice = ingredient.getPrice();
        Assert.assertEquals(expectedPrice, actualPrice, 0.0f);
    }


}

