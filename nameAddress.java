public class Main {
  public static void main(String args[]){
    System.out.println("Here is my name and address.");
    String name = ("Alice Hoyle");
    System.out.println(name);
    System.out.println("");
    System.out.println("221b Baker Street");
    System.out.println("Marylebone");
    System.out.println("London");
    System.out.println("NW1 6XE");

    for(int i = 0; i < name.length(); i++) {
         if(Character.isUpperCase(name.charAt(i)))
             System.out.println("*" + name.charAt(i) + "*");
         }
  }
}