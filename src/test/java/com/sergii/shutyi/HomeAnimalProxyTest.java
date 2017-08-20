package com.sergii.shutyi;

import com.sergii.shutyi.model.HomeAnimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeAnimalProxyTest {
    
    HomeAnimal homeAnimal;

    HomeAnimalProxy proxy;

    @Before
    public void setUp() throws Exception {
        homeAnimal = new HomeAnimal("Cat", 4, 10, "Murzik");
        proxy = new HomeAnimalProxy(homeAnimal);
    }

    @Test
    public void getName() throws Exception {
        String actualName = proxy.getName();
        Assert.assertEquals("Murzik", actualName);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void setName() throws Exception {
        proxy.setName("Bobby");
    }

}