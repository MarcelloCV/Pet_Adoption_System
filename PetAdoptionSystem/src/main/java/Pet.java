import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

interface ASCIIArt{
  void ASCIIArt();
}

public abstract class Pet{
  static HashMap<Pet, Account> petAdoptionList = new HashMap<>();
  static List<Pet> petList = new ArrayList<>();
  protected String name;
  protected String animalType;
  protected int age;
  protected int weight;
  protected String gender;
  protected String breed;

  public Pet(String name, String animalType, int age, int weight, String gender) {
      this.name = name;
      this.animalType = animalType;
      this.age = age;
      this.weight = weight;
      this.gender = gender;
  }

  public void description(){
      System.out.printf(
              "Name: %s\n Animal Type: %s\n Age: %s\n Weight: %s\n Gender %s",
              name, animalType , age, weight, gender
      );
  }
}

//Tiap class hrs punya method khasnya
class dog extends Pet implements ASCIIArt{
  public dog(String name,  int age, int weight, String gender) {
      super(name, "dog" , age, weight, gender);
  }
  @Override
  public void ASCIIArt(){
      System.out.println("\n" +
              "   |\\|\\\n" +
              "  ..    \\       .\n" +
              "o--     \\\\    / @)\n" +
              " v__///\\\\\\\\__/ @\n" +
              "   {           }\n" +
              "    {  } \\\\\\{  }\n" +
              "    <_|      <_|\n");

  }
  public void makeaNoise(){
      System.out.println("woof woof!");
  }
}

class cat extends Pet implements ASCIIArt{
  public cat(String name, int age, int weight, String gender) {
      super(name, "cat", age, weight, gender);
  }

  @Override
  public void ASCIIArt(){
      System.out.println("\n" +
              "    /\\_____/\\\n" +
              "   /  o   o  \\\n" +
              "  ( ==  ^  == )\n" +
              "   )         (\n" +
              "  (           )\n" +
              " ( (  )   (  ) )\n" +
              "(__(__)___(__)__)\n");
  }
  public void makeaNoise(){
      System.out.println("meow");
  }
}

class bird extends Pet implements ASCIIArt{
  public bird(String name, int age, int weight, String gender) {
      super(name, "bird", age, weight, gender);
  }
  @Override
  public void ASCIIArt(){
      System.out.println("\n" +
              "   (\n" +
              "  `-`-.\n" +
              "  '( @ >\n" +
              "   _) (\n" +
              "  /    )\n" +
              " /_,'  / \n" +
              "   \\  / \n" +
              "===m\"\"m===\n");
  }

  public void makeaNoise(){
      System.out.println("chirp chirp!");
  }
}
class bunny extends Pet implements ASCIIArt{
  static final String animalType = "bunny";
  public bunny(String name,  int age, double weight, String gender) {
      super(name, animalType, age, (int) weight, gender);
  }

  @Override
  public void ASCIIArt(){
      System.out.println("\n" +
              "       _\n" +
              "      (\\\\\n" +
              "       \\||\n" +
              "     __(_\";\n" +
              "    /    \\\n" +
              "   {}___)\\)_\n");
  }

  public void makeaNoise(){
      System.out.println("wheee");
  }
}