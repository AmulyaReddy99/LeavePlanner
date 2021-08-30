package com.company.LeavePlanner;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leaveManager")
public class EmployeeController {

    @PostMapping("/takeLeave")
    public ResponseEntity<String> takeLeave(@RequestBody Employee employee){

        employee.takeVacation(employee.getVacationDays());
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }

    @PostMapping("/work")
    public ResponseEntity<String> work(@RequestBody Employee employee){

        employee.work(employee.getWorkedDays());
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }
}
