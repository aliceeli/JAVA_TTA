class Main {
  public static void main(String[] args) {
    System.out.println("I will calculate the (rounded) circumference of 3 circles with radii a)3cm b)100cm and c)8.75cm.");
    int a = 3;
    int b = 100;
    double c = 8.75;
    double pi = 3.1415;
    System.out.println("c = 2πr.");
    System.out.println("a)" + Math.round(2 * pi * a) + " cm");
    System.out.println("b)" + Math.round(2 * pi * b) + " cm");
    System.out.println("c)" + Math.round(2 * pi * c) + " cm");

  }
}