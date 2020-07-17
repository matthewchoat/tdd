package tdd;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args){
    System.out.println("Hello World!");
    Main m = new Main();
    m.printHelloWorld();
  }

  public String printHelloWorld() {
    System.out.println("HELLO WORLD");
    Product b = new Product("Product 1", BigDecimal.valueOf(12.99), false, false);
    return "Hello World";

  }



}
