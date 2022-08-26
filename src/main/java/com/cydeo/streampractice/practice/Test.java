package com.cydeo.streampractice.practice;

import com.cydeo.streampractice.bootstrap.DataGenerator;
import com.cydeo.streampractice.model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.cydeo.streampractice.practice.Practice.*;

public class Test {
    public static void main(String[] args) {

        List<Driver> listDrivers = new ArrayList<>(Arrays.asList(
                new Driver("Mark", 1000),
                new Driver("Tom", 2000),
                new Driver("Pete", 2000),
                new Driver("Dan", 3000),
                new Driver("Sarah", 1000)));





        int secmin = listDrivers.stream()
                .sorted(Comparator.comparing(driver -> driver.getSalary()))
                .skip(1)
                .findFirst().get().getSalary();
        ;


        List<Driver> result = listDrivers.stream()

                .collect(Collectors.groupingBy(
                        Driver::getSalary,
                        TreeMap::new,
                        Collectors.toList()
                ))

                .get(secmin);

        System.out.println(secmin);
        System.out.println("Result" + result);
        System.out.println(listDrivers.stream()
                .sorted(Comparator.comparing(driver -> driver.getSalary()))
                .collect(Collectors.groupingBy(Driver::getSalary)));



    }


}

class Driver {
    String name;
    Integer salary;

    public Driver(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
