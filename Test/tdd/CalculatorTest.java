package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  public void test_isCalculatorGettingBasketData() {
    Basket basket = Basket.getBasketInstance();
    basket.buyProductsInBasket();
    basket.addProductToBasket("1984", BigDecimal.valueOf(12.49), false, true);
    calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal actual = basket.getProductsInBasket().get(0).getPrice();
    BigDecimal expected = BigDecimal.valueOf(12.49);
    System.out.println(expected);
    assertEquals(expected, actual);
  }

  @Test
  public void test_isTaxAndImportAddedToProductPrice(){
    //testing first product
    Basket basket = Basket.getBasketInstance();
    basket.buyProductsInBasket();
    basket.addProductToBasket("Imported Box of Chocolates", BigDecimal.valueOf(10.00), true, true);
    calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal actual = basket.getProductsInBasket().get(0).getPrice();
    BigDecimal expected = BigDecimal.valueOf(10.00).multiply(Constants.IMPORT_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println("Product 1 with tax " + expected);
    assertEquals(expected, actual);
    //testing second product
    basket.addProductToBasket("Music CD", BigDecimal.valueOf(14.99), false, false);
    calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal actual2 = basket.getProductsInBasket().get(1).getPrice();
    BigDecimal expected2 = BigDecimal.valueOf(14.99).multiply((Constants.TAX_MULTIPLIER)).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println("Product 2 with tax " + expected2);
    assertEquals(expected2, actual2);
    //testing third product
    basket.addProductToBasket("Imported Bottle of Perfume", BigDecimal.valueOf(27.99), true, false);
    calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal actual3 = basket.getProductsInBasket().get(2).getPrice();
    BigDecimal expected3 = BigDecimal.valueOf(27.99).multiply(Constants.TAXANDIMPORT_MULTIPLIER).setScale(2, RoundingMode.HALF_EVEN);
    System.out.println("Product 3 with tax " + expected3);
    assertEquals(expected3, actual3);
    //testing fourth product
    basket.addProductToBasket("Book", BigDecimal.valueOf(12.49), false, true);
    calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal actual4 = basket.getProductsInBasket().get(3).getPrice();
    BigDecimal expected4 = BigDecimal.valueOf(12.49);
    System.out.println("Product 4 with tax " + expected4);
    assertEquals(expected4, actual4);
  }

  @Test
  public void test_totalTaxesReturnedFromArray(){
    Basket basket = Basket.getBasketInstance();
    basket.buyProductsInBasket();
    basket.addProductToBasket("Imported Bottle of Perfume", BigDecimal.valueOf(27.99), true, false);
    basket.addProductToBasket("Music CD", BigDecimal.valueOf(14.99), false, false);
    BigDecimal actual = calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal expected = BigDecimal.valueOf(27.99).multiply(Constants.TAXANDIMPORT_RATE).setScale(2, RoundingMode.HALF_EVEN);
    expected = expected.add(BigDecimal.valueOf(14.99).multiply(Constants.TAX_RATE).setScale(2, RoundingMode.HALF_EVEN));
    System.out.println(expected);
    assertEquals(expected, actual);
  }

  @Test
  public void test_cartTotalReturnedFromArray(){
    Basket basket = Basket.getBasketInstance();
    basket.buyProductsInBasket();
    basket.addProductToBasket("Imported Bottle of Perfume", BigDecimal.valueOf(27.99), true, false);
    basket.addProductToBasket("Music CD", BigDecimal.valueOf(14.99), false, false);
    basket.addProductToBasket("Book", BigDecimal.valueOf(12.49), false, true);
    basket.addProductToBasket("Imported Box of Chocolates", BigDecimal.valueOf(10.00), true, true);
    calculator.addTaxes(basket.getProductsInBasket());
    BigDecimal expected = BigDecimal.valueOf(71.67).setScale(2, RoundingMode.HALF_EVEN);
    BigDecimal actual = calculator.getBasketTotal(basket.getProductsInBasket());
    assertEquals(expected, actual);
  }


}
