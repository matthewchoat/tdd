package tdd;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

  //Testing price
  public void getPriceHelper(IProduct product, BigDecimal price) {
    assertEquals(price, product.getPrice());
  }

  //Testing getName method
  public void getNameHelper(IProduct product, String name) {
    assertEquals(name, product.getName());
  }

  //Testing isExempted
  public void getExemptHelper(IProduct product, boolean exempt) {
    assertEquals(exempt, product.isExempt());
  }

  //Testing isImported
  public void getImportedHelper(IProduct product, boolean imported) {
    assertEquals(imported, product.isImported());
  }
}
