package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
  Product testProduct = new Product("Twilight", BigDecimal.valueOf(7), false, false);

  @Test
  public void testGetName() {
    String expected =  "Twilight";
    String actual = testProduct.getName();
    assertEquals(expected, actual);

  }

  @Test
  public void testGetPrice() {
    BigDecimal expected = BigDecimal.valueOf(7);
    BigDecimal actual = testProduct.getPrice();
    assertEquals(expected, actual);

  }

  @Test
  public void testIsImported() {
    boolean actual = testProduct.isImported();
    assertFalse(actual);

  }

  @Test
  public void testIsExempt() {
    boolean actual = testProduct.isExempt();
    assertFalse(actual);

  }
}
