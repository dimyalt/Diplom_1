import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

public class TestBurgerPrice {
    Burger objBurger = new Burger();
    private float result = 5510F;
    private Ingredient ingredientSause1 = new Ingredient(IngredientType.SAUCE, "Sause1", 1000F);
    private Ingredient ingredientSause2 = new Ingredient(IngredientType.SAUCE, "Sause2", 1000F);
    private Ingredient ingredientSause3 = new Ingredient(IngredientType.SAUCE, "Sause3", 1000F);
    Bun bun = new Bun("Краторная булка N-200i", 1255F);

    @Before
    public void initialize(){
        objBurger.setBuns(bun);
        objBurger.addIngredient(ingredientSause1);
        objBurger.addIngredient(ingredientSause2);
        objBurger.addIngredient(ingredientSause3);
    }
    @Test
    public void testPrice(){
        assertEquals(objBurger.getPrice(), result, 0);
    }
}
