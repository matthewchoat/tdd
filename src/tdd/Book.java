package tdd;

import java.math.BigDecimal;

public class Book implements IProduct {
  String name;
  BigDecimal price;

  public Book(String name, BigDecimal price) {
  this.name = name;
  this.price = price;
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
    return null;
  }

  @Override
  public void setPrice(BigDecimal price) {

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
