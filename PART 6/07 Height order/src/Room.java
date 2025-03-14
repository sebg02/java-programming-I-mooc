/**
 *  @author SEB
 */

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> listPeople;

    public Room() {
        this.listPeople = new ArrayList<>();
    }

    public void add(Person newPerson) {
        this.listPeople.add(newPerson);
    }

    public boolean isEmpty() {
        return this.listPeople.isEmpty();
    }

    // Maybe getPeople would be better...
    public ArrayList<Person> getPersons() {
        return this.listPeople;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = this.listPeople.get(0);
        for (Person p:listPeople) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person personToTake = this.shortest();
        this.listPeople.remove(personToTake);
        return personToTake;
    }
}
