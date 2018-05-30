package net.smallyu.java.designpattern.visitor.cases1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for(Employee emp : mockEmployee()) {
            emp.report();
        }
    }
    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("代码");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        return empList;
    }
}
