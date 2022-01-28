import java.sql.*;
import java.util.Properties;

public class ConnectionTest {
    //方式一
//public static void main(String[] args) throws Exception {
//        //获取Driver实现的对象
//        Driver driver=new com.mysql.jdbc.Driver();
//        String url = "jdbc:mysql://localhost:3306/test";
//        //将用户名和密码封装在Properties
//        Properties info=new Properties();
//
//        info.setProperty("user","root");
//        info.setProperty("password","root");
//
//        Connection conn= driver.connect(url,info);
//
//        System.out.println(conn);
//}
//   // 方式二:对方式一的迭代
//    public static void main(String[] args) throws Exception {
//        Class clazz=Class.forName("com.mysql.jdbc.Driver()");
//        Driver driver=(Driver) clazz.newInstance();
//        //2.提供要连接的数据库
//        String url="jdbc:mysql://localhost:3306/test";
//        //提供连接需要的用户名和密码
//        Properties info=new Properties();
//        info.setProperty("user","root");
//        info.setProperty("password","root");
//        //获取连接
//        Connection conn=driver.connect(url,info);
//        System.out.println(conn);
//    }
//方式三：使用DriverManager替换Driver
//    public static void main(String[] args) throws Exception {
//        //获取Driver实现类的对象
//        Class clazz=Class.forName("com.mysql.jdbc.Driver()");
//        Driver driver=(Driver) clazz.newInstance();
//        //提供另外三个连接的基本信息
//        String url="jdbc:mysql://localhost:3306/test";
//        String user="root";
//        String password="root";
//        //注册驱动
//        DriverManager.registerDriver(driver);
//        //获取连接
//        Connection conn=DriverManager.getConnection(url,user,password);
//        System.out.println(conn);


        public static void main(String[] args) throws Exception {
            Connection conn = null;
            try {
                // 加载驱动类
                Class.forName("com.mysql.cj.jdbc.Driver");
                long start = System.currentTimeMillis();

                // 建立连接
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                        "root", "root");
                long end = System.currentTimeMillis();
                System.out.println(conn);
                System.out.println("建立连接耗时： " + (end - start) + "ms 毫秒");

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

