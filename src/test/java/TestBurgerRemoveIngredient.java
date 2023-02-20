import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Burger;
import praktikum.Ingredient;
import static org.junit.Assert.assertEquals;

public class TestBurgerRemoveIngredient {
    Burger objBurger = new Burger();
    @Mock
    Ingredient ingredient;
    @Before
    public void initialize(){
        objBurger.addIngredient(ingredient);
    }
    @Test
    public void testRemoveIngredient(){
        objBurger.removeIngredient(0);
        assertEquals(objBurger.ingredients.size(), 0);
    }
}
