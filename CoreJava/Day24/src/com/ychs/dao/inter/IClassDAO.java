package com.ychs.dao.inter;

import com.ychs.bean.ClassInfo;

import java.util.List;
import java.util.Map;

/**
 * 班级接口
 */
public interface IClassDAO {
    // 添加
    int insertClass(ClassInfo classInfo);
    // 修改
    int updateClass(ClassInfo classInfo);
    // 删除
    int delClass(int id);
    // 查询
    List<ClassInfo> getClass(Map<String, Object> map);
}
