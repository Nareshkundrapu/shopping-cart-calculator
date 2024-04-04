import com.cart.shopping.ShoppingCartCalculator;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartCalculatorTest {

    @Test
    public void calculateTotalCostOfCart_withApplesAndBananas() {
        List<String> basket = new ArrayList<>(Arrays.asList("Apple", "Apple", "Banana", "Banana"));
        double expectedCost = 110; // 2 apples * 35p + 2 bananas * 20p = 110p
        assertEquals(expectedCost, ShoppingCartCalculator.calculateTotalCostOfCart(basket), 1);
    }

    @Test
    public void calculateTotalCostOfCart_withMelonsAndLimes() {
        List<String> basket = new ArrayList<>(Arrays.asList("Melon", "Melon", "Melon", "Lime", "Lime", "Lime"));
        double expectedCost = 130; // (2 melons * 50p)/2  + ( 1 melon * 50p) + (3 limes * 15p)*2/3 = 80
        assertEquals(expectedCost, ShoppingCartCalculator.calculateTotalCostOfCart(basket), 1);
    }

    @Test
    public void calculateTotalCostOfCart_withMixedItems() {
        List<String> basket = new ArrayList<>(Arrays.asList("Apple", "Banana", "Melon", "Lime", "Lime"));
        double expectedCost = 135; // 1 apple * 35p + 1 banana * 20p + (1 melon * 50p) + 2 limes * 15p = 135
        assertEquals(expectedCost, ShoppingCartCalculator.calculateTotalCostOfCart(basket), 1);
    }

    @Test
    public void calculateTotalCostOfCart_withEmptyBasket() {
        List<String> basket = new ArrayList<>();
        double expectedCost = 0; // Empty basket should have a total cost of 0.00
        assertEquals(expectedCost, ShoppingCartCalculator.calculateTotalCostOfCart(basket), 1);
    }

}

