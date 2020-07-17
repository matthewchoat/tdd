package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest  {

  //Testing price
  public void getPriceHelper(IProduct product, BigDecimal price) {
    assertEquals(price, product.getPrice());
  }
@Test
  public void test_PriceBook(){
    Book b = new Book("Book 1", BigDecimal.valueOf(12.99));
    getPriceHelper(b, BigDecimal.valueOf(12.99));
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
