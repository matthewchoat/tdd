package tdd;

import java.math.BigDecimal;

public interface IProduct {

  public String getName();
  public void setName(String name);

  public BigDecimal getPrice();
  public void setPrice(BigDecimal price);



  public boolean isExempt();
  public boolean isImported();



}
