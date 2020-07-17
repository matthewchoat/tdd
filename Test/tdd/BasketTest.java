package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
  Basket basket = Basket.getBasketInstance();

  @Test
public void test_IsBasketSingleton() {
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

    try {
      basket.addProductToBasket("1984", BigDecimal.valueOf(7), false, false);
      assertEquals("1984", basket.inBasket("1984"));
      System.out.println(basket.getProductsInBasket());
    } catch (final RuntimeException re){
      re.printStackTrace();
    }
  }

}
