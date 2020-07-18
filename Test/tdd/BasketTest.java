package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
  Basket basket = Basket.getBasketInstance();

  @Test
public void test_isBasketSingleton() {
    try {
    Basket basket2 = Basket.getBasketInstance();
    if (System.identityHashCode(basket) != System.identityHashCode(basket2)) {
    fail("WARNING: Basket is creating multiple instances");
    }
    assertTrue(true);

      } catch (final RuntimeException re){
      re.printStackTrace();
      }
    }

  @Test
  public void test_canAddToBasket(){

      basket.addProductToBasket("1984", BigDecimal.valueOf(7), false, true);
        String actual = basket.inBasket("1984");
        String expected = "1984";
          assertEquals(expected, actual);
      System.out.println(basket.getProductsInBasket());
      basket.addProductToBasket("domestic perfume", BigDecimal.valueOf(18.99), false, true);
        String actual2 = basket.inBasket("House of Leaves");
        String expected2 = "domestic perfume";
          assertEquals(expected2, actual2);
  }

}
