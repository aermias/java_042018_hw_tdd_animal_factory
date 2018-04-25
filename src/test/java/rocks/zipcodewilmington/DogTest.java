package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // DONE - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // DONE - Create tests for `speak`
    // DONE - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)`
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void MammalInheritanceTest() {
        Dog dog = new Dog(null, null, null);

        Assert.assertEquals(true, dog instanceof Mammal);
    }

    @Test
    public void AnimalInheritanceTest() {
        Dog dog = new Dog(null, null, null);

        Assert.assertEquals(true, dog instanceof Animal);
    }

    @Test
    public void getIdTest() {
        Integer givenId = 1;
        Dog dog = new Dog(null, null, givenId);

        Assert.assertEquals(givenId, dog.getId());
    }

    @Test
    public void eatTest() {
        // given you have a dog with no meals eaten
        Dog dog = new Dog(null, null, null);
        Integer amountOfMeals = dog.getNumberOfMealsEaten();
        Food kibble = new Food();

        // calls eat method
        dog.eat(kibble);

        // increases amountOfMeals by 1 & creates new Integer with the ArrayList size
        amountOfMeals++;
        Integer newAmountOfMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(amountOfMeals, newAmountOfMeals);
    }

    @Test
    public void setBirthDateTest() {
        Dog dog = new Dog(null, null, null);
        Date givenDate = new Date();

        dog.setBirthDate(givenDate);
        Date retrievedDate = dog.getBirthDate();

        Assert.assertEquals(givenDate, retrievedDate);
    }

    @Test
    public void speakTest() {
        Dog cat = new Dog(null, null, null);
        String expectedReturn = "bark!";

        Assert.assertEquals(expectedReturn, cat.speak());
    }

    @Test
    public void constructorTest() {
        String givenName = "Doggo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
