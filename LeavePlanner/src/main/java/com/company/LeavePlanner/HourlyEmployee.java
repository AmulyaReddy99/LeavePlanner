package com.company.LeavePlanner;

public class HourlyEmployee extends Employee {
    public final Float maxVacationDays = 10.0F;

    HourlyEmployee() {}

    public void setVacationDays(Float vacationDays) {
        if (getVacationDays() + vacationDays < maxVacationDays) {
            takeVacation(vacationDays);
        }
    }

    public void setWorkDays(Integer workDays) {
        work(workDays);
    }
}
