package cn.mldn.lxh.dao.test;

import cn.mldn.lxh.factory.DAOFactory;
import cn.mldn.lxh.vo.Emp;

public class TestDAOInsert {
    public static void main(String[] args) throws Exception {
        Emp emp = null;
        for (int x = 0; x < 5; x++) {
            emp = new Emp();
            emp.setEmpno(1010 + x);
            emp.setEname("sy - " + x);
            emp.setJob("程序员 - " + x);
            emp.setHiredate(new java.util.Date());
            emp.setSal(500 * x);
            DAOFactory.getIEmpDAOInstance().doCreate(emp);
        }
    }
}
