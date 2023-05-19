class A extends Thread {
  public void run() {
    for (char my_temp= 'A'; my_temp <= 'Z'; ++ my_temp    ) {
      System.out.println(my_temp);
    }
  }
}

class B extends Thread {
  public void run() {
    for (int q = 100; q  >0; q--) {
      System.out.println(q);
    }
  }
}

class Multi {
  public static void main(String[] args) {

    A a = new A();
      a.start();

    B b = new B();
      b.start();
   
  }
}