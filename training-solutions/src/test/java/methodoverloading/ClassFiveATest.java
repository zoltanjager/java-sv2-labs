package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();


    @Test

    void testGetTodayReferringStudentWithInt() {

        String name = classFiveA.getTodayReferringStudent(2);

        assertEquals("Gipsz Jakab", name);
    }

    @Test

    void testGetTodayReferringStudentWithNumber() {

        String name = classFiveA.getTodayReferringStudent(Number.TWO);

        assertEquals("Gipsz Jakab", name);
    }

    @Test

    void testGetTodayReferringStudentWithString() {

        String name = classFiveA.getTodayReferringStudent("two");

        assertEquals("Gipsz Jakab", name);
    }
}