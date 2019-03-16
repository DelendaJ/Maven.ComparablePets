package io.zipcoder;



public abstract class Pet implements Comparable<Pet> {
    private String name;

    public Pet(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

    public int compareTo(Pet pet) {
        return this.name.compareTo(pet.name);
    }
}
