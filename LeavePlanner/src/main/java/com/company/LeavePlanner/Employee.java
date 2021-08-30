package com.company.LeavePlanner;

public abstract class Employee {

    private Float vacationDays = 0.0F;
    private final Integer totalWorkDays = 260;
    private Integer workedDays = 0;
    private String type;

    private String employeeId;

    Employee() {}

    public void work(Integer daysWorked) {
        if (workedDays + daysWorked < totalWorkDays) {
            workedDays += daysWorked;
        }
    }

    public void takeVacation(Float vacationsUsed) {
        vacationDays += vacationsUsed;
    }

    public Float getVacationDays() {
        return vacationDays;
    }

    public Integer getWorkedDays() {
        return workedDays;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
