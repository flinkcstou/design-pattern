package singleton;

public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {

  }

  public static Singleton getInstance() {
    System.out.println("Singleton getInstance");
    return singleton;
  }

}
