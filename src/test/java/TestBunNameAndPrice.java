import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestBunNameAndPrice {
    private final String bunName;
    private final float bunPrice;
    private Bun objBun;


    public TestBunNameAndPrice(String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }
    @Before
    public void makeBun() {
        objBun = new Bun(bunName, bunPrice);
    }
    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"fluorescent", 950.00f},
                {"", 1.01f},
                {"   ", 1.01f},
                {null, 1.01f},
                {"kvyjxvcuscocdmzrnqgwnfketjrzcnmesqlyneubysqfwncppvpsklmmcgrpgrcutirbybhyadxxorqryroqcfufpqunyzbqi" +
                        "yehgckfgnzofukefkgiydmycisqpbzqwutroxaekvtzsmecixuypbnyknqfoujqogfgnbpvdbylgbmrjgxdlgtpsca" +
                        "nknpkxbazxveccxwarmdfjfdvjyafayfpykvmtnliuzsgtmeusikgqjpaxtyiib", 1.01f},
                {"!@#$%^&*()", 1.01f},
                {"12345", 1.01f},
                {"bunForBurger", -0.1f},
                {"bunForBurger", 0},
                {"bunForBurger", 0.0000000001f},
                {"bunForBurger", 1},
                {"bunForBurger", 999999999},


        };
    }
    @Test
    public void getBunName(){
        assertEquals(bunName, objBun.getName());
    }

    @Test
    public void getBunPrice(){
        assertEquals(bunPrice, objBun.getPrice(),0);
    }

}
