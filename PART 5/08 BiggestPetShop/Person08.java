/**
 * @author SEB
 */

public class Person08 {

    private String name;
    private Pet pet;

    public Person08 (String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person08 (String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person08() {
        this("Lilo", new Pet("Stitch", "Blue alien"));
    }

    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + "(" + this.pet.getBreed() + ")";
    }


    
}
