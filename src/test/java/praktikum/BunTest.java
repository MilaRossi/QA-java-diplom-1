package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    @Test
    public void checkName() {
        Bun bun = new Bun("Bun", 44);
        String expectedName = "Bun";
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void checkPrice() {
        Bun bun = new Bun("Bun", 44);
        float expectedPrice = 44;
        float actualPrice = bun.getPrice();
        Assert.assertEquals(expectedPrice, actualPrice, 0.0f);
    }
}
