package tdd;

import java.math.BigDecimal;

public interface IProduct {

  public static String name = "";
  public static BigDecimal price = null;
  public static boolean exempt = false, imported = false;

  public String getName();
  public void setName(String name);

  public BigDecimal getPrice();
  public void setPrice(BigDecimal price);



  public boolean isExempt();
  public boolean isImported();



}
