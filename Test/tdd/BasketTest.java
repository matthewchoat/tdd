package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
  Basket basket = Basket.getBasketInstance();

  @Test
  public void test_AddToBasket() {
  }

  @Test
public void test_IsCartSingleton() {
    try {
    Basket basket2 = Basket.getBasketInstance();
    if (System.identityHashCode(basket) != System.identityHashCode(basket2)) {
    fail("Basket is creating multiple instances!");
    }
    assertTrue(true);

      } catch (final RuntimeException re){
      re.printStackTrace();
      }
    }
}
