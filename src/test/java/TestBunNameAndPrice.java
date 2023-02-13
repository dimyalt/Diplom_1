import praktikum.Bun;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBunNameAndPrice {
    private String bunName = "fluorescent";
    private float bunPrice = 950.00f;
    Bun objBun = new Bun(bunName, bunPrice);

    @Test
    public void getBunName(){
        assertEquals(bunName, objBun.getName());
    }

    @Test
    public void getBunPrice(){
        assertEquals(bunPrice, objBun.getPrice(),0);
    }

}
