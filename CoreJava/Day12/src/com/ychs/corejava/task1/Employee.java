package com.ychs.corejava.task1;

/**
 * 员工类模板
 */
public abstract class Employee {
    /**
     * 部门与岗位
     */
    protected String department;
    protected String type;
    /**
     * 工号与姓名
     */
    protected int employeeID;
    protected String employeeName;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
