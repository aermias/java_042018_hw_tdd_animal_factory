package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // DONE - Create tests for `void add(Dog dog)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Dog dog)`
    // DONE - Create tests for `Dog getDogById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getDogByIdTest() {
        // given
        Dog givenDog = AnimalFactory.createDog(null, null);

        // when
        DogHouse.add(givenDog);
        Dog retrievedDog = DogHouse.getDogById(givenDog.getId());

        // then
        Assert.assertEquals(givenDog.getName(), retrievedDog.getName());
        Assert.assertEquals(givenDog.getBirthDate(), retrievedDog.getBirthDate());
        Assert.assertEquals(givenDog.getId(), retrievedDog.getId());
    }

    @Test
    public void removeByIdTest() {
        // given
        Dog givenDog = AnimalFactory.createDog(null, null);

        // when
        DogHouse.clear();

        DogHouse.add(givenDog);
        DogHouse.remove(givenDog.getId());

        // then
        Assert.assertEquals(new Integer(0), DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeByCatTest() {
        // given
        Dog givenDog = AnimalFactory.createDog(null, null);

        // when
        DogHouse.clear();

        DogHouse.add(givenDog);
        DogHouse.remove(givenDog);

        // then
        Assert.assertEquals(new Integer(0), DogHouse.getNumberOfDogs());
    }

    @Test
    public void addTest() {
        // given
        Dog givenDog = AnimalFactory.createDog(null, null);

        // when
        DogHouse.clear();
        DogHouse.add(givenDog);

        Dog retrievedDog = DogHouse.getDogById(givenDog.getId());

        // then
        Assert.assertEquals(givenDog, retrievedDog);
    }

    @Test
    public void testGetNumberOfDogs() {
        Dog animal = AnimalFactory.createDog("Milo", new Date());

        DogHouse.clear();
        DogHouse.add(animal);

        Assert.assertEquals(new Integer(1), DogHouse.getNumberOfDogs());
    }
}
