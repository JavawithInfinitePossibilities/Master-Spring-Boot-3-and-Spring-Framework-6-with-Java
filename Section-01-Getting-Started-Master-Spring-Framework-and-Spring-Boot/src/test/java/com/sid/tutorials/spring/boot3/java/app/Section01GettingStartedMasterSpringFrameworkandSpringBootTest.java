package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.bean.Car;
import com.sid.tutorials.spring.boot3.java.app.bean.Person;
import com.sid.tutorials.spring.boot3.java.app.mockdata.MockDataPrep;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 05-08-2024
 */
@SpringBootTest(classes = Section01GettingStartedMasterSpringFrameworkandSpringBoot.class)
class Section01GettingStartedMasterSpringFrameworkandSpringBootTest {
    @Autowired
    private MockDataPrep mockDataPrep;

    @Disabled
    @Test
    void getPeople() {
        try {
            List<Person> people = mockDataPrep.getPeople();
            people.stream().forEach(p -> System.out.println(p.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*@Disabled*/
    @Test
    void getCars() {
        try {
            List<Car> cars = mockDataPrep.getCars();
            cars.stream().forEach(car -> System.out.println(car.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    void getUnique() {
        int[] arra1 = {-1, 4, 5, 7, -2, -6};
        int[] arra2 = {7, 8, -2, 4, -6, -1, 5};
        int unique = 0;
        for (int i = 0; i < arra1.length; i++) {
            System.out.println(Integer.toBinaryString(unique));
            System.out.println(Integer.toBinaryString(arra1[i]));
            System.out.println(Integer.toBinaryString(arra2[i]));
            unique ^= arra1[i];
            System.out.println(Integer.toBinaryString(unique));
            unique ^= arra2[i];
            System.out.println(Integer.toBinaryString(unique));
        }
        if (arra2.length > arra1.length) {
            unique ^= arra2[arra1.length];
        }
        System.out.println("Unique value : " + unique);
    }
}