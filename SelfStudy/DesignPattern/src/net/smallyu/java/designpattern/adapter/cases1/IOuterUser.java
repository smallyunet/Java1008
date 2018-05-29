package net.smallyu.java.designpattern.adapter.cases1;

import java.util.Map;

public interface IOuterUser {
    // 基本信息，名称、性别、手机号码
    public Map getUserBaseInfo();
    // 工作区域信息
    public Map getUserOffceInfo();
     // 用户的家庭信息
    public Map getUserHomeInfo();
}
