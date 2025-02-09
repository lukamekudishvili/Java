import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal doggo = new Dog("kavkasiurinagazi","big",100);
        doAnimalStuff(doggo);

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(doggo);
        animals.add(new Dog("German shephard","Big",150));
        animals.add(new Fish("Goldfish","small",30));
        System.out.println(animals);
        System.out.println(doggo.getExplicitType());

        Animal animal1=new Horse("Mustang", "Big", 300);
        if(animal1 instanceof Horse horse){
            horse.shedHair();
        }


    }
    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("lok");
    }
}
