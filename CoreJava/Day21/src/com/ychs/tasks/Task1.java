/*
    2018 copyright
 */

package com.ychs.tasks;

import com.ychs.tasks.dao.IStudentDAO;
import com.ychs.tasks.factory.DAOFactory;
import com.ychs.tasks.vo.Student;

import java.util.List;
import java.util.Scanner;

/**
 * 任务一
 */
public class Task1 {

    private Integer currPage = 0;
    private Integer itemsCount = 0;
    private Integer pageNum = 3;
    private Integer pageCount = 0;

    private IStudentDAO dao;

    public Task1 () {
        // 获取dao对象
        this.dao = DAOFactory.getStudentDAOInstance();
        // 初始化部分数据
        this.itemsCount = this.dao.findItemsCount();
        this.pageCount = this.itemsCount / pageNum - 1;
    }

    /**
     * 根据输入参数显示指定内容
     * @param flag
     */
    private void show(int flag) {
        // 确定对应操作
        switch (flag) {
            case 0:
                this.currPage = 0;
                break;
            case 1:
                this.currPage = this.currPage - 1 >= 0 ? this.currPage - 1 : 0;
                break;
            case 2:
                this.currPage = this.currPage + 1 <= pageCount ? this.currPage + 1 : pageCount;
                break;
            case 3:
                this.currPage = pageCount;
                break;
            case 4:
                System.out.println();
                System.out.print("请输入页数：");
                this.currPage = new Scanner(System.in).nextInt() - 1;
                break;
            default:
                System.out.println("输入有误！\n");
                break;
        }

        // 查询数据
        List<Student> all = this.dao.findByPage(this.currPage, this.pageNum);

        // 输出全部数据
        System.out.println("\n学生信息(" + (this.currPage + 1) + " / " + (this.pageCount + 1) + ")");

        System.out.print("学员id" + "\t");
        System.out.print("学员姓名" + "\t");
        System.out.print("学员性别" + "\t");
        System.out.print("学员班级" + "\t");
        System.out.print("班主任" + "\t");
        System.out.println();
        System.out.println("-----------------------------------------------------");

        for (Student student : all) {

            System.out.print(student.getId() + "\t\t");
            System.out.print(student.getName() + "\t\t");
            System.out.print(student.getGender() + "\t\t");
            System.out.print(student.getClassNo() + "\t\t");
            System.out.print(student.getTeacher() + "\t\t");

            System.out.println();
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("0 首页\t\t 1 上一页\t\t 2 下一页\t\t 3 尾页\t\t 4 跳转\t\t 9 退出");
        System.out.println();
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        // 初始化显示
        Task1 t = new Task1();
        t.show(0);

        Scanner sc = new Scanner(System.in);

        // 循环，输入9退出
         while(true) {
            Integer flag = sc.nextInt();
            if (flag == 9) {
               break;
            }
            t.show(flag);
        }
    }
}
