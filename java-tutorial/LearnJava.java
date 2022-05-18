public class LearnJava {
  public static void main(String[] args) {
    String name = "Christian";
    String exclaim = addExclamationPoint(name);
    System.out.println(exclaim);
    Animal a = new Animal();
    String dog = a.iAmDog();
    System.out.println(dog);
    a.doStuff();
  }

  public static String addExclamationPoint(String s) {
    return s + "!";
  }
}