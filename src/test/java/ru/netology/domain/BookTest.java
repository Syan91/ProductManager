package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "Остров сокровищ", 500, "Роберт Льюс Стивенсон");

    @Test
    public void shouldMatchByNameIfExists() {
        String text = "Остров сокровищ";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldMatchByNameIfNotExists() {
        String text = "Тестирование ПО";
        assertFalse(book.matches(text));
    }

    @Test
    public void shouldMatchByAuthorIfExists() {
        String text = "Роберт Льюс Стивенсон";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldMatchByAuthorIfNotExists() {
        String text = "Святослав Куликов";
        assertFalse(book.matches(text));
    }
}