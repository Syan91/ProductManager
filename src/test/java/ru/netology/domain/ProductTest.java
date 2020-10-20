package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1, "Остров сокровищ", 500);

    @Test
    void shouldMatchByNameIfExists() {
        String text = "Остров сокровищ";
        assertTrue(product.matches(text));
    }

    @Test
    void shouldMatchByNameIfNotExists() {
        String text = "Тестирование ПО";
        assertFalse(product.matches(text));
    }
}