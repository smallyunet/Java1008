package com.ychs.test;

import com.ychs.bean.ClassInfo;
import com.ychs.service.ClassServiceImpl;
import com.ychs.service.inter.IClassService;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class ClassTest {

    @Test
    public void insertClass() {
        IClassService classService = new ClassServiceImpl();
        ClassInfo classInfo = new ClassInfo();
        classInfo.setName("测试");
        boolean res = classService.insertClass(classInfo);
        assertTrue(res);
    }

    @Test
    public void getClassInfo() {
        IClassService classInfo = new ClassServiceImpl();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "一");
        List<ClassInfo> list =  classInfo.getClass(map);
        for (ClassInfo c : list) {
            System.out.println(c);
        }
    }
}
