package com.ychs.lesson.test;

import com.ychs.lesson.bean.ClassInfo;
import com.ychs.lesson.dao.ClassDAO;
import org.junit.Test;

import java.util.List;

public class ClassDAOTest {

    private ClassDAO classDAO = new ClassDAO();

    public static void main(String[] args) {
        ClassInfo classInfo = new ClassInfo();
//        classInfo.setId(100);
//        classInfo.setName("一百班");
        ClassDAO classDAO = new ClassDAO();
//        System.out.println(classDAO.insertClass(classInfo) > 0 ? "插入成功" : "插入失败");
    }

    @Test
    public void setClassById() {
        ClassInfo classInfo = this.classDAO.getClassById();
        System.out.println(classInfo);
    }

    @Test
    public void getClassList() {
        List<ClassInfo> classInfo = this.classDAO.getClassList();
        for (ClassInfo c : classInfo) {
            System.out.println(c);
        }
    }

}
