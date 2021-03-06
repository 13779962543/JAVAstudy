package MyBatisStudy02.dao;

//import jdk.jfr.StackTrace;

import MyBatisStudy02.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Student02Test {
    /*
    删除功能
     */
    @Test
    public void delete() throws Exception{
        //1.加载核心配置文件
        InputStream is=Resources.getResourceAsStream("MyBatisConfig02.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSession工厂对象获取SqlSession对象
//        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行映射配置文件中的sql语句,并接收结果
//        Student stu= new Student(8,"小宋",26);
        int result=sqlSession.delete("StudentMapper.delete",8);
        //提交事务
        sqlSession.commit();
        //5.处理结果
        System.out.println(result);
        //6.释放资源
        sqlSession.close();
        is.close();
    }
    /*
    修改功能
     */
    @Test
    public void update() throws Exception{
        //1.加载核心配置文件
        InputStream is=Resources.getResourceAsStream("MyBatisConfig02.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSession工厂对象获取SqlSession对象
//        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行映射配置文件中的sql语句,并接收结果
        Student stu= new Student(8,"小宋",26);
        int result=sqlSession.update("StudentMapper.update",stu);
        //提交事务
        sqlSession.commit();
        //5.处理结果
        System.out.println(result);
        //6.释放资源
        sqlSession.close();
        is.close();
    }

    /*
    新增功能
     */
    @Test
    public void insert() throws Exception{
        //1.加载核心配置文件
        InputStream is=Resources.getResourceAsStream("MyBatisConfig02.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSession工厂对象获取SqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        //4.执行映射配置文件中的sql语句,并接收结果
        Student stu= new Student(8,"小可",26);
        int result=sqlSession.insert("StudentMapper.insert",stu);
        //提交事务
//        sqlSession.commit();
        //5.处理结果
        System.out.println(result);
        //6.释放资源
        sqlSession.close();
        is.close();
    }
    /*
    根据id进行查询
     */
    @Test
    public void selectById() throws Exception{
        //1.加载核心配置文件
        InputStream is=Resources.getResourceAsStream("MyBatisConfig02.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSession工厂对象获取SqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行映射配置文件中的sql语句,并接收结果
        Student stu=sqlSession.selectOne("StudentMapper.selectById",3);
        //5.处理结果
        System.out.println(stu);
        //6.释放资源
        sqlSession.close();
        is.close();
    }
    /*
    查询全部
     */
    @Test
    public void selectAll() throws Exception{

        //1.加载核心配置文件
        InputStream is=Resources.getResourceAsStream("MyBatisConfig02.xml");
//        InputStream is=StudentTest01.class.getClassLoader().getResourceAsStream("MyBatisConfig.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSession工厂对象获取SqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行映射配置文件中的sql语句,并接收结果
        List<Student> list=sqlSession.selectList("StudentMapper.selectAll");
        //5.处理结果
        for (Student stu:list){
            System.out.println(stu);
        }
        //6.释放资源
        sqlSession.close();
        is.close();
    }

}
