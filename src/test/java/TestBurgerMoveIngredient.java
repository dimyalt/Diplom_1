import org.junit.Before;
import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

public class TestBurgerMoveIngredient {
    private Burger objBurger = new Burger();
    private String result = "Sause3";

    private final Ingredient ingredientSause1 = new Ingredient(IngredientType.SAUCE, "Sause1", 1.00F);
    private final Ingredient ingredientSause2 = new Ingredient(IngredientType.SAUCE, "Sause2", 2.00F);
    private final Ingredient ingredientSause3 = new Ingredient(IngredientType.SAUCE, "Sause3", 3.00F);
    
    @Before
    public void initialize(){
        objBurger.addIngredient(ingredientSause1);
        objBurger.addIngredient(ingredientSause2);
        objBurger.addIngredient(ingredientSause3);
    }
    @Test
    public void testMoveIngredient(){
        objBurger.moveIngredient(2, 0); //переместили Sause3 в начало списка
        assertEquals(objBurger.ingredients.get(0).name, result);
    }

}
