package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // DONE - Create tests for `void setName(String name)`
    // DONE - Create tests for `speak`
    // DONE - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)`
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void MammalInheritanceTest() {
        // given
        Cat cat = new Cat(null, null, null);

        // then
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void AnimalInheritanceTest() {
        // given
        Cat cat = new Cat(null, null, null);

        // then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void getIdTest() {
        // given
        Integer givenId = 1;
        Cat cat = new Cat(null, null, givenId);

        Assert.assertEquals(givenId, cat.getId());
    }

    @Test
    public void eatTest() {
        // given you have a cat with no meals eaten
        Cat cat = new Cat(null, null, null);
        Integer amountOfMeals = cat.getNumberOfMealsEaten();
        Food sardines = new Food();

        // calls eat method
        cat.eat(sardines);

        // increases amountOfMeals by 1 & creates new Integer with the ArrayList size
        amountOfMeals++;
        Integer newAmountOfMeals = cat.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(amountOfMeals, newAmountOfMeals);
    }

    @Test
    public void setBirthDateTest() {
        // given
        Cat cat = new Cat(null, null, null);
        Date givenDate = new Date();

        // when
        cat.setBirthDate(givenDate);
        Date retrievedDate = cat.getBirthDate();

        // then
        Assert.assertEquals(givenDate, retrievedDate);
    }

    @Test
    public void speakTest() {
        // given
        Cat cat = new Cat(null, null, null);

        // when
        String expectedReturn = "meow!";

        // then
        Assert.assertEquals(expectedReturn, cat.speak());
    }

    @Test
    public void setNameTest() {
        // given
        Cat cat = new Cat(null, null, null);
        String givenName = "Kitty";

        // when
        cat.setName(givenName);
        String catName = cat.getName();

        // then
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
