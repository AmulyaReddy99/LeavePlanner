package com.company.LeavePlanner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Employees implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Employee> salariedEmployees = new ArrayList<>();
        List<Employee> hourlyEmployees = new ArrayList<>();
        List<Employee> managers = new ArrayList<>();

        for (int i=0; i<10; i++) {
            Employee employee = new SalariedEmployee();
            salariedEmployees.add(employee);

            employee = new HourlyEmployee();
            hourlyEmployees.add(employee);

            employee = new Managers();
            managers.add(employee);
        }
    }
}