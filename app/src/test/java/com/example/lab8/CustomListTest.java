package com.example.lab8;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;}


    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();

        City city = new City("Charlottetown", "Prince Edward Island");
        list.add(city);
        assertEquals(true, list.hasCity(city));

    }


    @Test
    void testDeleteCity() {
        list = MockCityList();

        City city = new City("Charlottetown", "Prince Edward Island");
        list.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(city);
        });
    }



    @Test
    void testCountCities() {
        list = MockCityList();

        City city = new City("Charlottetown", "Prince Edward Island");
        list.add(city);

        assertEquals(list.getCities().size(), (list.countCities()));

    }




}
