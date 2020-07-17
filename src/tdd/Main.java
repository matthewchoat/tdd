package tdd;

import java.math.BigDecimal;
import java.util.Map;

public class Main {

  public static void main(String[] args){
    System.out.println("Hello World!");
    Main m = new Main();
    m.printHelloWorld();
  }

  public String printHelloWorld() {
    System.out.println("HELLO WORLD");
    Book b = new Book("Book 1", BigDecimal.valueOf(12.99));
    return "Hello World";

  }



}
