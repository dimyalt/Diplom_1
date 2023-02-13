import org.junit.Test;
import praktikum.IngredientType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestIngredientsTypes {
    String ingredientsList = Arrays.toString(IngredientType.values());
    int typesQuantity = 2;
    @Test
    public void testIngredientsTypeSAUCE() {
        assertTrue(ingredientsList.contains("SAUCE"));
    }
    @Test
    public void testIngredientsTypeFILLING() {
        assertTrue(ingredientsList.contains("FILLING"));
    }
    @Test
    public void testIngredientsTypeQuantity() {
        IngredientType[] ingredientType = IngredientType.values();
        assertEquals(ingredientType.length, typesQuantity);
    }
}
