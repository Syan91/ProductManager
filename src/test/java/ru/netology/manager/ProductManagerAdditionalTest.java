package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerAdditionalTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);
    private Book first = new Book(1, "Остров сокровищ", 500, "Роберт Льюс Стивенсон");
    private Book second = new Book(2, "Тестирование ПО", 600, "Святослав Куликов");
    private Book third = new Book(3, "Работа с MySQL", 700, "Святослав Куликов");
    private Smartphone smartphone1 = new Smartphone(1, "Samsung", 75000, "Южная Корея");
    private Smartphone smartphone2 = new Smartphone(2, "Apple", 90000, "Тайвань");

    @BeforeEach
    public void setUp() {
        manager = new ProductManager(repository);
        manager.productAdd(first);

    }

    @Test
    void shouldSearchBookByNameIfExists() {
        String text = "Остров сокровищ";

        Product[] expected = new Product[]{first};
        Product[] actual = manager.searchBy(text);
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldNotSearchBookByNameIfNotExists() {
        String text = "Игра престолов";

        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBookByAuthorIfExists() {
        String text = "Роберт Льюс Стивенсон";

        Product[] expected = new Product[]{first};
        Product[] actual = manager.searchBy(text);
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldNotSearchBookByAuthorIfNotExists() {
        String text = "Джордж Мартин";

        Book[] expected = new Book[]{};
        Product[] actual = manager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

}