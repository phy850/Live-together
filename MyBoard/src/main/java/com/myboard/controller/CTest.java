package com.myboard.controller;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class CTest {

  final String DRIVER = "org.mariadb.jdbc.Driver";
  final String URL = "jdbc:mariadb://127.0.0.1:3306";
  final String USER = "phy850";
  final String PASSWORD = "3116";
  
  @Test
  public void mariaTest() throws Exception{
   Class.forName(DRIVER);
   
   try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD)){
    System.out.println(con);
   } catch(Exception e) {
    e.printStackTrace();
   }
  }
}