package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    // DONE - Create Test for `Animal createDog(String name, Date birthDate)`
    // DONE - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        // REFACTOR & SHORTEN
        String givenName = "Zula";
        Date givenDate = new Date();

        Cat retrievedCat = AnimalFactory.createCat(givenName, givenDate);

        Assert.assertEquals(givenName, retrievedCat.getName());
        Assert.assertEquals(givenDate, retrievedCat.getBirthDate());
    }

    @Test
    public void createDogTest() {
        String givenName = "Milo";
        Date givenDate = new Date();

        Dog retrievedDog = AnimalFactory.createDog(givenName, givenDate);

        Assert.assertEquals(givenName, retrievedDog.getName());
        Assert.assertEquals(givenDate, retrievedDog.getBirthDate());
    }
}
