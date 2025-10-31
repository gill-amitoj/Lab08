//package com.example.lab08;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//public class CustomListTest {
//
//}
package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        assertTrue(list.hasCity(calgary));
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        // ensure other city is still present
        assertTrue(list.hasCity(edmonton));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        assertEquals(0, list.countCities());
        list.addCity(calgary);
        list.addCity(edmonton);
        assertEquals(2, list.countCities());

        list.deleteCity(calgary);
        assertEquals(1, list.countCities());
    }
}