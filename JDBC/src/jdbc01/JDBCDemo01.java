package jdbc01;

import java.sql.*;

public class JDBCDemo01 {
    public static void main(String[] args) throws Exception{
        //导入jar包
        //注册驱动
//        Driver driver=new com.mysql.jdbc.Driver();
        //获取链接
        Connection con=DriverManager.getConnection("jdbc:mysql://192.168.0.105:3306/bookshop","root","root");
        //获取执行者对象
        //获取普通执行者对象 Statement createStatement();
        //获取预编译执行者对象 PreparedStatementprepareStatement(String sql)
        //管理事务
        //开启事务；setAutoCommit(boolean autoCommit);  参数为false,则开启事务
        //提交事务：commit()
        //回滚事务：rollback()
        //释放资源：void close()
        //Statement
        //1.执行DML语句，int executeUpdate(String sql)
        //      返回值int,参数：可执行insert,update,delete
        // 2.执行DQL语句，ResultSet executeQuery(String sql)
        //      返回值ResultSet；封装查询结果
        //ResultSet
        //1.判断结果集中是否还有数据：boolean next() 有数据返回true，并将索引向下移动一行
        //2.获取结果集中的数据；XXX getXxx("列名") 例如:String getString("name") int getInt("age")
        Statement stat=con.createStatement();
        //执行sql语句,并接收成果
        String sql="SELECT*FROM user";
        ResultSet rs=stat.executeQuery(sql);
        //处理结果
        while(rs.next()){
            System.out.println(rs.getInt("u_id")+"\t"+rs.getString("u_name"));
        }
        //释放资源
        con.close();
        stat.close();
        con.close();
    }
}
