import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;


public class TestIngredientName {
    private final IngredientType ingredientType = IngredientType.SAUCE;
    private final String ingredientName = "Соус Spicy-X";
    private final int ingredientPrice = 90;
    Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);

    @Test
    public void testIngredientName(){
        assertEquals(ingredient.getName(), ingredientName);

    }
}
