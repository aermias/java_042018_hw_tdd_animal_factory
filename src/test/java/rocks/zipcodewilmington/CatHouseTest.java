package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // DONE - Create tests for `void add(Cat cat)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Cat cat)`
    // DONE - Create tests for `Cat getCatById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getCatByIdTest() {
        // given
        Cat givenCat = AnimalFactory.createCat(null, null);

        // when
        CatHouse.add(givenCat);
        Cat retrievedCat = CatHouse.getCatById(givenCat.getId());

        // then
        Assert.assertEquals(givenCat.getName(), retrievedCat.getName());
        Assert.assertEquals(givenCat.getBirthDate(), retrievedCat.getBirthDate());
        Assert.assertEquals(givenCat.getId(), retrievedCat.getId());
    }

    @Test
    public void removeByIdTest() {
        // given
        Cat givenCat = AnimalFactory.createCat(null, null);

        // when
        CatHouse.clear();

        CatHouse.add(givenCat);
        CatHouse.remove(givenCat.getId());

        // then
        Assert.assertEquals(new Integer(0), CatHouse.getNumberOfCats());
    }

    @Test
    public void removeByCatTest() {
        // given
        Cat givenCat = AnimalFactory.createCat(null, null);

        // when
        CatHouse.clear();

        CatHouse.add(givenCat);
        CatHouse.remove(givenCat);

        // then
        Assert.assertEquals(new Integer(0), CatHouse.getNumberOfCats());
    }

    @Test
    public void addTest() {
        // given
        Cat givenCat = AnimalFactory.createCat(null, null);

        // when
        CatHouse.clear();
        CatHouse.add(givenCat);

        Cat retrievedCat = CatHouse.getCatById(givenCat.getId());

        // then
        Assert.assertEquals(givenCat, retrievedCat);
    }

    @Test
    public void getNumberOfCatsTest() {
        // given
        Cat animal = AnimalFactory.createCat(null, null);

        // when
        CatHouse.clear();
        CatHouse.add(animal);

        // then
        Assert.assertEquals(new Integer(1), CatHouse.getNumberOfCats());
    }
}
