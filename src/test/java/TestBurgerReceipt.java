import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;


public class TestBurgerReceipt {
    private final Ingredient ingredient1 = new Ingredient(IngredientType.SAUCE, "Соус традиционный галактический", 15.00F);
    private final Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "Говяжий метеорит (отбивная)", 3000.00F);
    private final Ingredient ingredient3 = new Ingredient(IngredientType.SAUCE, "Соус традиционный галактический", 90.00F);
    private final Bun bun = new Bun("Краторная булка N-200i", 1255F);
    private final Burger objBurger = new Burger();

    @Before
    public void initialize() {
        objBurger.setBuns(bun);
        objBurger.addIngredient(ingredient1);
        objBurger.addIngredient(ingredient2);
        objBurger.addIngredient(ingredient3);
    }
    @Test
    public void testReceipt(){
        String actual = objBurger.getReceipt();

        StringBuilder result = new StringBuilder(String.format("(==== %s ====)%n", bun.getName()));
        for (Ingredient ingredient : objBurger.ingredients) {
            result.append(String.format("= %s %s =%n", ingredient.getType().toString().toLowerCase(),
                    ingredient.getName()));
        }
        result.append(String.format("(==== %s ====)%n", bun.getName()));
        result.append(String.format("%nPrice: %f%n", objBurger.getPrice()));

        assertEquals(result.toString(), actual);
    }
}
