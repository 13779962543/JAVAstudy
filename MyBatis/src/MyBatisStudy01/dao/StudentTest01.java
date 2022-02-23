package MyBatisStudy01.dao;

import MyBatisStudy01.bean.Student;
//import jdk.jfr.StackTrace;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class StudentTest01 {
    /*
    查询全部
     */
    @Test
    public void selectAll() throws Exception{

        //1.加载核心配置文件
        InputStream is=Resources.getResourceAsStream("MyBatisConfig.xml");
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
