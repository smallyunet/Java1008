package com.ychs.corejava.task1;

public class AndroidEmployee extends Employee  {
    /**
     * 工作内容
     */
    public void workContent() {
        System.out.println("员工号为" + this.employeeID + "的员工" + this.employeeName + "正在研发淘宝手机客户端网站");
    }
}
