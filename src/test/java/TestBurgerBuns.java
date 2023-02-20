import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestBurgerBuns {

    private String bunName = "Краторная булка N-200i";
    @Mock
    Bun bun;
    @Test
    public void testBuns(){
        Burger objBurger = new Burger();
        objBurger.setBuns(bun);
        Mockito.when(objBurger.bun.getName()).thenReturn(bunName);
        assertEquals(bunName, objBurger.bun.getName());
    }
}
