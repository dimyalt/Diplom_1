import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TestIngredientType {
    private final IngredientType ingredientType;
    private final String ingredientName;
    private final int ingredientPrice;

    public TestIngredientType(IngredientType ingredientType, String ingredientName, int ingredientPrice) {
        this.ingredientType = ingredientType;
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {IngredientType.SAUCE, "Соус Spicy-X", 90},
                {IngredientType.FILLING, "Мясо бессмертных моллюсков Protostomia", 1337},
        };
    }

    @Test
    public void testIngredientType(){
        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        assertEquals(ingredient.getType(), ingredientType);
    }
}
