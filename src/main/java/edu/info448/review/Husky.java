package edu.info448.review;

public class Husky extends Dog implements Huggable {
  /* class body goes here */

  public void pullSled() {
     System.out.println("pulling sled");
  }

  public void bark() {
     System.out.println(this+" says: Woof!");
  }

  public void hug() {
     System.out.println("hugging");
  }
}