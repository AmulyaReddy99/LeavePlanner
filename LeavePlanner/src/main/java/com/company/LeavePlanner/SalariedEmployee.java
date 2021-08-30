package com.company.LeavePlanner;

public class SalariedEmployee extends Employee {

    public final Float maxVacationDays = 15.0F;

    SalariedEmployee() {}

    public void setVacationDays(Float vacationDays) {
        if (getVacationDays() + vacationDays < maxVacationDays) {
            takeVacation(vacationDays);
        }
    }

    public void setWorkDays(Integer workDays) {
        work(workDays);
    }
}
