package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
  Basket basket = Basket.getBasketInstance();
  Calculator calculator = new Calculator();

  @Test
  public void test_addTaxToPrice() {
    basket.addProductToBasket("1984", BigDecimal.valueOf(7), false, true);
    BigDecimal actual = calculator.addTaxes();
    BigDecimal expected = BigDecimal.valueOf(7).multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println(expected);
    assertEquals(expected, actual);
  }

  @Test
  public void test_updateProductPrice(){
    basket.addProductToBasket("1984", BigDecimal.valueOf(7), false, true);
//    calculator.addTaxes();
    BigDecimal actual = basket.getProductsInBasket().get(0).getPrice();
    BigDecimal expected = BigDecimal.valueOf(7).multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println(expected);
    assertEquals(expected, actual);
  }
}
