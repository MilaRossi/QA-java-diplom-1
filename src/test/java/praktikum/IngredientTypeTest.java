package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {

    @Test
    public void  IngredientTypeIsSauce() {
        String expectedType = "SAUCE";
        String actualType = IngredientType.valueOf("SAUCE").toString();
        assertEquals(expectedType,actualType);
    }

    @Test
    public void  IngredientTypeIsFilling() {
        String expectedType = "FILLING";
        String actualType = IngredientType.valueOf("FILLING").toString();
        assertEquals(expectedType,actualType);
    }

    @Test(expected = NullPointerException.class)
    public void valueOfWithFirstException() throws NullPointerException {
        IngredientType.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOfWithSecondException() throws IllegalArgumentException {
        IngredientType.valueOf("BUN");
    }

}
