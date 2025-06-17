package tn.esprit.spring;

import org.junit.After;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.class)
public class BlocServiceTest {

    @BeforeAll
    public static void bedore() {
    }

    @AfterAll
    public static void after() {
    }

    @BeforeEach
    void beforeEach() {
    }

    @AfterEach
    void afterEach() {
    }

    @Test
    @Order(1)
    void test() {
    }

    @Test
    @Order(2)
    void test3() {
    }

    @Test
    @Order(3)
    void test4() {
    }

    @Test
    @Order(4)
    void test2() {
    }
}
