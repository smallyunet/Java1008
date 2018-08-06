package com.ychs.service.inter;

import com.ychs.bean.ClassInfo;

import java.util.List;
import java.util.Map;

public interface IClassService {
    boolean insertClass(ClassInfo classInfo);
    List<ClassInfo> getClass(Map<String, Object> map);
}
