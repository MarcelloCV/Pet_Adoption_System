import java.util.ArrayList;

interface InnerPets {
   public void ascii();
}

public abstract class Pets{
  ArrayList<Pets> petsList = new ArrayList<>();  
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

  public void adpot(){
    
  }
}

//Tiap class hrs punya method khasnya
class dog extends Pets implements InnerPets{
  public dog(String name,  int age, int weight, String gender, String misc) {
    super(name, "dog" , age, weight, gender, misc);
  }
  @Override
  public void ascii(){
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

class cat extends Pets implements InnerPets{
  public cat(String name, int age, int weight, String gender, String misc) {
    super(name, "cat", age, weight, gender, misc);
  }

  public void ascii(){
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

class bird extends Pets implements InnerPets{
  public bird(String name, int age, int weight, String gender, String misc) {
    super(name, "bird", age, weight, gender, misc);
  }
  public void ascii(){
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

class bunny extends Pets implements InnerPets{
  static final String animalType = "bunny";
  public bunny(String name,  int age, int weight, String gender, String misc) {
    super(name, animalType, age, weight, gender, misc);
  }

  public void ascii(){  
    System.out.println("\n" +
    "       _\n" +
    "      (\\\\\n" +
    "       \\||\n" +
    "     __(_\";\n" +
    "    /    \\\n" +
    "   {}___)\\)_\n");
  }
}