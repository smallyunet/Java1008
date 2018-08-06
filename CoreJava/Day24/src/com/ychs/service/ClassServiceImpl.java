package com.ychs.service;

import com.ychs.bean.ClassInfo;
import com.ychs.dao.ClassDAOImpl;
import com.ychs.dao.inter.IClassDAO;
import com.ychs.service.inter.IClassService;

import java.util.List;
import java.util.Map;

public class ClassServiceImpl implements IClassService  {
    private IClassDAO classDao = new ClassDAOImpl();

    @Override
    public boolean insertClass(ClassInfo classInfo) {
        int res = classDao.insertClass(classInfo);
        if (res > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<ClassInfo> getClass(Map<String, Object> map) {
        return classDao.getClass(map);
    }
}
