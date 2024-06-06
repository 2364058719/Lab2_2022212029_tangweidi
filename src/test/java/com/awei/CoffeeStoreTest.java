package com.awei;

import com.awei.ReFineCoffeeStore.Coffee;
import com.awei.ReFineCoffeeStore.CoffeeStore;
import com.awei.ReFineCoffeeStore.DecafCoffee;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Tests for CoffeeStore、Coffee、Flavour、CoffeeFactory、FlavourFactory
 * Tests against the spec
 */
public class CoffeeStoreTest {
    /*
     * Test strategy for Coffee
     *
     * Partition for the inputs of Coffee.addPrice(inputs):
     *                              Coffee:DecafCoffee
     *                              inputs:price<0, price>=0
     *
     * Partition for the inputs of Coffee.addFlavour(inputs):
     *                              Coffee:DecafCoffee
     *                              inputs: empty inputs,normal inputs,repeated inputs
     *
     */

    @Test
    public void testAddPrice(){
        Coffee coffee = new DecafCoffee("Decaf",3);
        int price = 1;
        coffee.addPrice(price);
        assertTrue(4 == coffee.getPrice());
    }

    @Test
    public void testAddFlavour(){
        Coffee coffee = new DecafCoffee("Decaf",3);
        String flavour = "Flavour";
        assertTrue(coffee.addFlavour(flavour));
        assertFalse(coffee.addFlavour(flavour));
    }

    /*
     * Test strategy for CoffeeStore
     *
     * Partition for CoffeeStore.orderCoffee():
     *
     * Partition for the inputs of CoffeeStore.orderFlavour(inputs):
     *                              inputs:normal inputs,empty inputs
     *
     */

    @Test
    public void testOrderCoffee(){
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee();
        assertNotNull(coffee);
        assertEquals("Decaf", coffee.getName());
        assertEquals(3, coffee.getPrice());
    }

    @Test
    public void testOrderFlavour(){
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee();
        Coffee coffee1 = coffeeStore.orderFlavour(coffee);
        assertNotNull(coffee1);
        assertEquals("Decaf", coffee1.getName());
        assertEquals(4, coffee1.getPrice());
    }


}
