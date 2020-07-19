package tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class ReceiptTest {
Receipt receipt = Receipt.getReceiptInstance();

  @Test
    public void test_canGetPurchaseData() {
    Basket basket = Basket.getBasketInstance();
    basket.addProductToBasket("1984", BigDecimal.valueOf(7), false, true);
    String expected = basket.getProductsInBasket().get(0).getName() + ":" + "   $" + basket.getProductsInBasket().get(0).getPrice();
    String actual = receipt.processPurchases(basket.getProductsInBasket());
    assertEquals(expected, actual);
  }



}
