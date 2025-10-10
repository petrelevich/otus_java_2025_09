package ru.otus.testing.example;

import org.junit.jupiter.api.*;

@SuppressWarnings({"java:S2699"})
class LifeCycleTest {
    // Подготовительные мероприятия. Метод выполнится один раз, перед всеми тестами
    @BeforeAll
    static void globalSetUp() {
        System.out.println("@BeforeAll");
    }

    // Подготовительные мероприятия. Метод выполнится перед каждым тестом
    @BeforeEach
    void setUp() {
        System.out.println("\n@BeforeEach. ");
        System.out.printf("Экземпляр тестового класса: %s%n", Integer.toHexString(hashCode()));
    }

    // Сам тест
    @Test
    void anyTest1() {
        System.out.println("@Test: anyTest1. ");
        System.out.printf("Экземпляр тестового класса: %s%n", Integer.toHexString(hashCode()));
    }

    // Еще тест
    @Test
    void anyTest2() {
        System.out.println("@Test: anyTest2. ");
        System.out.printf("Экземпляр тестового класса: %s%n", Integer.toHexString(hashCode()));
    }

    // Завершающие мероприятия. Метод выполнится после каждого теста
    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach. ");
        System.out.printf("Экземпляр тестового класса: %s%n", Integer.toHexString(hashCode()));
    }

    // Завершающие мероприятия. Метод выполнится один раз, после всех тестов
    @AfterAll
    static void globalTearDown() {
        System.out.println("\n@AfterAll");
    }
}
