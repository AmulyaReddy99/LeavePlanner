package com.company.LeavePlanner;

public class Managers extends Employee {
    public final Float maxVacationDays = 30.0F;

    Managers() {}

    public void setVacationDays(Float vacationDays) {
        if (getVacationDays() + vacationDays < maxVacationDays) {
            takeVacation(vacationDays);
        }
    }

    public void setWorkDays(Integer workDays) {
        work(workDays);
    }
}
