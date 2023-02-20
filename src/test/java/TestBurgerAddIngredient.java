import org.junit.Test;
import org.mockito.Mock;
import praktikum.Burger;
import praktikum.Ingredient;
import static org.junit.Assert.assertEquals;


public class TestBurgerAddIngredient {
    @Mock
    Ingredient ingredient;
    @Test
    public void testAddIngredient(){
        Burger objBurger = new Burger();
        objBurger.addIngredient(ingredient);
        assertEquals(objBurger.ingredients.size(), 1);
    }


}
