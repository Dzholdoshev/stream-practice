package com.cydeo.streampractice.practice;

import com.cydeo.streampractice.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.cydeo.streampractice.practice.Practice.departmentService;
import static com.cydeo.streampractice.practice.Practice.getAllEmployees;

public class Test {
    public static void main(String[] args) {

        System.out.println("hello");
       //Map<Long, List<Employee>> getAll = getAllEmployees().stream().collect(Collectors.groupingBy(departmentService.readById(), Employee::getDepartment ));

    }
}
