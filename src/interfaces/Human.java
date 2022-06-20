package interfaces;

public class Human extends Mammal implements Herbivore,Carnivore{
    @Override
    public void eatPlant() {
        System.out.println("Human is eating plant");
    }

    @Override
    public void eatAnimal() {
        System.out.println("Human is eating Animal");
    }
}
