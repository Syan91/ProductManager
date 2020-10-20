package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone1 = new Smartphone(1, "Samsung", 75000, "Южная Корея");

    @Test
    public void shouldMatchByNameIfExists() {
        String text = "Samsung";
        assertTrue(smartphone1.matches(text));
    }

    @Test
    public void shouldMatchByNameIfNotExists() {
        String text = "Apple";
        assertFalse(smartphone1.matches(text));
    }

    @Test
    public void shouldMatchByManufacturerIfExists() {
        String text = "Южная Корея";
        assertTrue(smartphone1.matches(text));
    }

    @Test
    public void shouldMatchByAuthorIfNotExists() {
        String text = "Тайвань";
        assertFalse(smartphone1.matches(text));
    }
}