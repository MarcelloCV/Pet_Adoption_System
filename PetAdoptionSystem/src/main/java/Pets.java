interface InnerPets {
   public void adpot();
   public void description();
 }

public abstract class Pets{
  protected String name;
  protected String AnimalType;
  protected int age;
  protected int weight;
    public Pets(String name, String animalType, int age, int weight) {
        this.name = name;
        this.AnimalType = animalType;
        this.age = age;
        this.weight = weight;
    }
}

//Tiap class hrs punya method khasnya
class dog extends Pets implements InnerPets{
  final String species = "dog";
  String breed;
  String description;

  dog(String name, String animalType, int age, int weight, String breed, String color) {
    super(name, animalType, age, weight);
    this.breed = breed;
  }
  @Override
  public void adpot(){

  }
  public void description(){

  }
}

class cat extends Pets implements InnerPets{
  final String species = "cat";
  String breed;
  String description;
  public cat(String name, String animalType, int age, int weight, String breed, String color) {
    super(name, animalType, age, weight);
    this.breed = breed;
  }
  @Override
  public void adpot(){

  }
  public void description(){

  }
}

class bird extends Pets implements InnerPets{
  String species;
  String description;

  public bird(String name, String animalType, int age, int weight, String species, String color) {
    super(name, animalType, age, weight);
    this.species = species;
  }
  @Override
  public void adpot(){

  }
  public void description(){

  }
  
}

class hamster extends Pets implements InnerPets{
  String description;

  public hamster(String name, String animalType, int age, int weight) {
    super(name, animalType, age, weight);
 }
  @Override
  public void adpot(){

  }
  public void description(){

  }
  
}