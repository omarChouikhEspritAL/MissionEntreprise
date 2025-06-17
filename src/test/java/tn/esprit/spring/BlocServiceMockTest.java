package tn.esprit.spring;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

//@ExtendWith(MockitoExtension.class)
//@TestMethodOrder(MethodOrderer.class)
//@SpringBootTest
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class BlocServiceMockTest {

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

