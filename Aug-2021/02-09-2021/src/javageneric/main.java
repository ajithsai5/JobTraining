package javageneric;

public class main<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	   public static void main(String[] args) {
	      main<Integer> integerBox = new main<Integer>();
	      main<String> stringBox = new main<String>();
	    
	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));

	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	   }
	}
