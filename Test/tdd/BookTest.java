package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
  Book testBook = new Book("Smile", BigDecimal.valueOf(7), false, false);

  @Test
  public void testGetName() {
    String expected =  "Smile";
    String actual =testBook.getName();
    assertEquals(expected, actual);

  }

  @Test
  public void testGetPrice() {
    BigDecimal expected = BigDecimal.valueOf(7);
    BigDecimal actual = testBook.getPrice();
    assertEquals(expected, actual);

  }
}
