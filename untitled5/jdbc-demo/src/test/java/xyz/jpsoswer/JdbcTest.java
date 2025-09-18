package xyz.jpsoswer;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcTest {

   @Test
    public void jdbcUpdate() throws Exception {
       //注册驱动
       Class.forName("com.mysql.cj.jdbc.Driver");
       //获取数据库连接
       String url = "jdbc:mysql://localhost:3306/web01";
       String username = "root";
       String password = "jss0219";
       Connection connection = DriverManager.getConnection(url, username, password);
       //获取SQL语句执行对象
       Statement statement = connection.createStatement();
       //执行SQL
       int i = statement.executeUpdate("update user set age = 25 where id = 1");
       System.out.println("SQL语句执行完毕，改变记录数为"+i);
       //释放资源
       statement.close();
       connection.close();
   }

   @Test
   public void jdbcUpdate1() throws Exception {
      //注册驱动
      Class.forName("com.mysql.cj.jdbc.Driver");
      //获取数据库连接
      String url = "jdbc:mysql://localhost:3306/web01";
      String username = "root";
      String password = "jss0219";
      Connection connection = DriverManager.getConnection(url,username,password);
      //获取sql语句执行对象
      Statement statement = connection.createStatement();
      //执行SQL
      int i = statement.executeUpdate("update user set age = 20 where id = 2");
      System.out.println(i);
      //释放资源
      statement.close();
      connection.close();
   }

   @Test
   public void jdbcQue() throws Exception {
      //注册驱动
      Class.forName("com.mysql.cj.jdbc.Driver");

      //获取SQL连接
      String url = "jdbc:mysql://localhost:3306/web01";
      String username = "root";
      String password = "jss0219";
      Connection connection = DriverManager.getConnection(url, username, password);
      //获取SQL语句执行权限
      Statement statement = connection.createStatement();
      //执行SQL
      ResultSet resultSet = statement.executeQuery("select * from user where username= 'daqiao' and password = '123456' ");
      while (resultSet.next())
      {
         User us = new User(
                 resultSet.getInt("id"),
                 resultSet.getString("username"),
                 resultSet.getString("password"),
                 resultSet.getString("name"),
                 resultSet.getInt("age")
         );
         System.out.println(us);
      }
      //释放资源
      statement.close();
      connection.close();
   }

   @Test
   public void select2() throws Exception {
      //注册驱动
      Class.forName("com.mysql.cj.jdbc.Driver");
      //获取SQL连接
      String url = "jdbc:mysql://localhost:3306/web01";
      String username = "root";
      String password = "jss0219";
      Connection connection = DriverManager.getConnection(url, username, password);
      //获取预编译语句执行权限
      PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username= ? and password = ?");
      preparedStatement.setString(1,"daqiao");
      preparedStatement.setString(2,"123456");
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next())
      {
         User us = new User(
                 resultSet.getInt("id"),
                 resultSet.getString("username"),
                 resultSet.getString("password"),
                 resultSet.getString("name"),
                 resultSet.getInt("age")
         );
         System.out.println(us);
      }
      //释放资源
      resultSet.close();
      preparedStatement.close();
      connection.close();
   }
}



