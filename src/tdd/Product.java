package tdd;

import java.math.BigDecimal;

public class Product implements IProduct {
  String name;
  BigDecimal price;
  boolean imported, exempt;

  public Product(String name, BigDecimal price, boolean imported, boolean exempt) {
  this.name = name;
  this.price = price;
  this.imported = imported;
  this.exempt = exempt;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public BigDecimal getPrice() {
    return this.price;
  }

  @Override
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean isExempt() {
    return false;
  }

  @Override
  public boolean isImported() {
    return false;
  }
}
