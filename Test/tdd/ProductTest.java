package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
  Product testProduct = new Product("Twilight", BigDecimal.valueOf(7), false, false);

  @Test
  public void test_isGettingName() {
    String expected =  "Twilight";
    String actual = testProduct.getName();
    assertEquals(expected, actual);

  }

  @Test
  public void test_isGettingPrice() {
    BigDecimal expected = BigDecimal.valueOf(7);
    BigDecimal actual = testProduct.getPrice();
    assertEquals(expected, actual);

  }

  @Test
  public void test_IsGettingImported() {
    boolean actual = testProduct.isImported();
    assertFalse(actual);

  }

  @Test
  public void test_IsGettingExempt() {
    boolean actual = testProduct.isExempt();
    assertFalse(actual);

  }
}
