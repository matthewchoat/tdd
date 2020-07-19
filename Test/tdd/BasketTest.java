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
  public void test_canAddProductsToBasket(){
      //adding first product
      basket.addProductToBasket("1984", BigDecimal.valueOf(7), false, true);
        String actual = basket.inBasket("1984");
        String expected = "1984";
          assertEquals(expected, actual);
      //adding second product
      basket.addProductToBasket("domestic perfume", BigDecimal.valueOf(18.99), false, true);
        String actual2 = basket.inBasket("domestic perfume");
        String expected2 = "domestic perfume";
          assertEquals(expected2, actual2);
  }

  @Test
  public void test_isEmptyBasketClearingArray() {
    basket.buyProductsInBasket();
    basket.addProductToBasket("1984", BigDecimal.valueOf(12.49), false, true);
    basket.addProductToBasket("domestic perfume", BigDecimal.valueOf(18.99), false, true);

    int actual = basket.getProductsInBasket().size();
    int expected = 2;
    assertEquals(expected, actual);

    basket.buyProductsInBasket();

    int actual2 = basket.getProductsInBasket().size();
    int expected2 = 0;
    assertEquals(expected2, actual2);

  }

}
