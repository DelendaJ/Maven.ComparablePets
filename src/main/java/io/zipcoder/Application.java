package io.zipcoder;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class Application {
    public static void main(String[] args) {
        ArrayList<Pet> listOfPets = new ArrayList<Pet>();

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        Integer numberOfPets = null;
        while (numberOfPets == null) {
            try {
                numberOfPets = Integer.parseInt(userInput.nextLine());
            } catch (Exception e) {
                System.out.println("Bad input, try again");
            }
        }
        System.out.println("You have " + numberOfPets + " pets");

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What type is your pet?");
            String type = userInput.nextLine();
            System.out.println("What's your pet's name?");
            String name = userInput.nextLine();
            if (type.equals("Dog")) {
                Pet dog = new Dog(name);
                listOfPets.add(dog);
            } else if
            (type.equals("Cat")) {
                Pet cat = new Cat(name);
                listOfPets.add(cat);
            } else if (type.equals("Scorpion")) {
                Pet scorpion = new Scorpion(name);
                listOfPets.add(scorpion);
            }
        }
        Collections.sort(listOfPets,new PetComparator());
        for (Pet pet : listOfPets) {
            System.out.println(pet.getName());
            System.out.println(pet.speak());
        }

    }


}

