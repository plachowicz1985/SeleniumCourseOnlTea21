package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.*;

public class Test1 {

        @Test
        public void test1() {
            System.out.println("test pierwszy");
        }

        @Test
        public void test2() {
            System.out.println("test drugi");
        }

        @Disabled
        @Test
        public void test3() {
            System.out.println("test jest niewidoczny");
        }

        @BeforeEach
        public void beforeEach() {
            System.out.println("przed każdym testem");
        }

        @AfterEach
        public void afterEach() {
            System.out.println("po każdym teście");
        }

        @BeforeAll
        public static void beforeAll() {
            System.out.println("przed wszystkimi testami");
        }

        @AfterAll
        public static void afterAll() {
            System.out.println("po wszystkich testach");
        }
    }

