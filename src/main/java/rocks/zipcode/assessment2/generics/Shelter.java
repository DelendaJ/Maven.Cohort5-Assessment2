package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.function.Supplier;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */


public class Shelter<_> {


    Shelter<Person> shelter = new Shelter<>();

    public Shelter() {
        throw new NullPointerException();

    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return this.shelter.size();

    }

    public void add(Object object) {
        this.shelter.add(object);

    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
      return this.shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        return this.shelter.getIndexOf(ageable);
    }
}