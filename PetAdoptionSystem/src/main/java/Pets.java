

import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface ASCIIArt{
   public void ASCIIArt();
}
class name, age{
  String name = name;
}


public abstract class Pets{
  static List<Pets> petAdoptionList = new ArrayList<>();
  static List<Pets> petList = new ArrayList<>();  
  protected String name;
  protected String animalType;
  protected int age;
  protected int weight;
  protected String gender;
  protected String breed; 
  protected String misc;

  public Pets(String name, String animalType, int age, int weight, String gender, String misc) {
    this.name = name;
    this.animalType = animalType;
    this.age = age;
    this.weight = weight;
    this.gender = gender;
    this.misc = misc;
  }

  public void description(){
    System.out.printf(
      "Name: %s\n Animal Type: %s\n Age: %s\n Weight: %s\n Gender %s",
      name, animalType , age, weight, gender
    );
  }
}

//Tiap class hrs punya method khasnya
class dog extends Pets implements ASCIIArt{
  public dog(String name,  int age, int weight, String gender, String misc) {
    super(name, "dog" , age, weight, gender, misc);
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
  }
}

class cat extends Pets implements ASCIIArt{
  public cat(String name, int age, int weight, String gender, String misc) {
    super(name, "cat", age, weight, gender, misc);
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
}

class bird extends Pets implements ASCIIArt{
  public bird(String name, int age, int weight, String gender, String misc) {
    super(name, "bird", age, weight, gender, misc);
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
}

class bunny extends Pets implements ASCIIArt{
  static final String animalType = "bunny";
  public bunny(String name,  int age, int weight, String gender, String misc) {
    super(name, animalType, age, weight, gender, misc);
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
}