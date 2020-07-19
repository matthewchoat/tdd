package tdd;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Receipt {
  private static Receipt receipt = new Receipt();

  public static Receipt getReceiptInstance(){
    return receipt;
  }

  public void printReceipt(ArrayList<IProduct> orders, BigDecimal totalTaxes, BigDecimal purchaseTotal){
    System.out.println("Cart Item               Price");
    System.out.println("-------------------------------\n");
    processPurchases(orders);
    System.out.println("Sales Taxes: $" + totalTaxes + "\n");
    System.out.println("Total: $" + purchaseTotal + "\n");
    System.out.println("-------------------------------\n");
  }

  public String processPurchases(ArrayList<IProduct> orders) {
    String temp = "";
    for(IProduct product:orders){
      System.out.println(product.getName() + ":" + "   $" + product.getPrice() + "\n");
      temp = product.getName() + ":" + "   $" + product.getPrice();
    }
    return temp;
  }
}
