/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.company.main;

import com.company.entity.User;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.dao.inter.UserDaoInter;
import com.company.dao.inter.UserSkillDaoInter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // UserDaoInter userDao = new UserDaoImpl();
        // List<User>list = userDao.getAll();
        //userDao.removeUser(1);
        //List<User>list2 = userDao.getAll();

        // System.out.println("list="+list);
        //System.out.println("list="+list2);
   UserDaoInter dao = Context.instanceUserDao();
   User user = dao.getById(1);
   System.out.println(user);
if (user == null) {
    System.out.println("No user found with id ");
} else {
    System.out.println(user);
}
    }

}
