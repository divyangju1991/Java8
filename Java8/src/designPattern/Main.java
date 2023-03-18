package designPattern;

class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
          if (instance != null) {
                throw new RuntimeException("Use only getInstance() to get instance!");
          }
    }

    public static Singleton getInstance() {
          if (instance == null) {
                synchronized(Singleton.class) {
                      if (instance == null) {
                            instance = new Singleton();
                      }
                }
          }
          return instance;
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World => "+ Singleton.getInstance().hashCode());
		System.out.println("Hello World => "+ Singleton.getInstance().hashCode());
		System.out.println("Hello World => "+ Singleton.getInstance().hashCode());
	}
}