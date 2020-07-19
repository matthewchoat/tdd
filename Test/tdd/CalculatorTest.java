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
    basket.addProductToBasket("1984", BigDecimal.valueOf(12.49), false, true);
    BigDecimal actual = calculator.addTaxes();
    BigDecimal expected = BigDecimal.valueOf(12.49).multiply(Constants.TAX_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println(expected);
    assertEquals(expected, actual);
  }

  @Test
  public void test_updateProductPrice(){
    //testing first product
    basket.addProductToBasket("1984", BigDecimal.valueOf(12.49), false, true);
    calculator.addTaxes();
    BigDecimal actual = basket.getProductsInBasket().get(0).getPrice();
    BigDecimal expected = BigDecimal.valueOf(12.49).multiply(Constants.TAX_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println("Product 1 with tax " + expected);
    assertEquals(expected, actual);
    //testing second product
    basket.addProductToBasket("Music CD", BigDecimal.valueOf(14.99), false, false);
    calculator.addTaxes();
    BigDecimal actual2 = basket.getProductsInBasket().get(1).getPrice();
    BigDecimal expected2 = BigDecimal.valueOf(14.99).multiply((Constants.TAX_MULTIPLIER)).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println("Product 2 with tax " + expected2);
    assertEquals(expected2, actual2);
  }

  @Test
  public void test_getAllTaxes(){
    basket.addProductToBasket("1984", BigDecimal.valueOf(12.49), false, true);
    //calculator.addTaxes();
    BigDecimal actual = calculator.addTaxes();
    BigDecimal expected = BigDecimal.valueOf(12.49).multiply(Constants.TAX_RATE).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println(expected);
    assertEquals(expected, actual);
  }
}
