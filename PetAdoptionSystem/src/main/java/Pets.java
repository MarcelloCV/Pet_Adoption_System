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
class dog extends Pets{
  
  String breed;
  String color;
  public dog(String name, String animalType, int age, int weight, String breed, String color) {
    super(name, animalType, age, weight);
    this.breed = breed;
    this.color = color;
  }
  
}

class cat extends Pets{
  String breed;
  String color;
  public cat(String name, String animalType, int age, int weight, String breed, String color) {
    super(name, animalType, age, weight);
    this.breed = breed;
    this.color = color;
  }
}

class bird extends Pets{
  
}

class hamster extends Pets{
  
}