package io.zipcoder;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getName() {
        //Given
        Scorpion scorpion = new Scorpion("");
        String actual = "Pinch E. McGee";
        scorpion.setName(actual);

        //When
       String expected = scorpion.getName();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void setName() {

        //Given
        Scorpion scorpion = new Scorpion("");
        String actual = "Pinch E. McGee";

        //When
      scorpion.setName(actual);

        //Then
        assertEquals(actual, scorpion.getName());


    }

    @Test
    public void speak() {
        //Given
        Pet petty = new Dog("");
        String expected = "Woof! Woof! Woof!";

        //When
        String actual = petty.speak();

        //Then
        assertEquals(expected, actual);
    }
}