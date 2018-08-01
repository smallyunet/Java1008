/*
    2018
 */
package com.ychs.tasks;

import com.ychs.tasks.dao.IUserDAO;
import com.ychs.tasks.factory.DAOFactory;

import java.util.Scanner;

/**
 * 任务二，登录注册系统
 */
public class Task2 {

    private IUserDAO dao;

    /**
     * 初始化，获取dao对象
     */
    public Task2() {
        dao = DAOFactory.getUserDAOInstance();
    }

    /**
     * 主方法，主要逻辑
     * @param args
     */
    public static void main(String[] args) {
        Task2 t = new Task2();
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        System.out.println("请选择： 0 登录 \t 1 注册");
        Integer flag = sc.nextInt();
        if (flag == 0) {
            System.out.print("请输入用户名：");
            username = sc.next();
            System.out.print("请输入密码：");
            password = sc.next();
            if(t.dao.findOne(username, password)) {
                System.out.println("登录成功！欢迎" + username + "进入系统!");
            } else {
                System.out.println("登录失败");
            }
        } else if (flag == 1) {
            System.out.print("请输入用户名：");
            username = sc.next();
            System.out.print("请输入密码：");
            password = sc.next();
            Integer auth = 3;
            if(t.dao.addUser(username, password, auth)) {
                System.out.println("注册成功！");
            } else {
                System.out.println("注册失败！");
            }
        } else {
            System.out.println("输入有误！");
        }
    }
}
