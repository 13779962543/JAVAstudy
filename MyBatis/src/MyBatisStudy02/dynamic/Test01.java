package MyBatisStudy02.dynamic;

//import MyBatisStudy01.bean.Student;
import MyBatisStudy02.bean.Student;
import MyBatisStudy02.mapper.StudentMapper02;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

    @Test
    public void selectByIds() throws Exception{
        InputStream is = Resources.getResourceAsStream("MyBatisConfig02.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        StudentMapper02 mapper = sqlSession.getMapper(StudentMapper02.class);

        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);

//        stu.setAge(23);

        List<Student> list=mapper.selectByIds(ids);

        for (Student student :list){
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void selectCondition() throws Exception{
        InputStream is = Resources.getResourceAsStream("MyBatisConfig02.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        StudentMapper02 mapper = sqlSession.getMapper(StudentMapper02.class);

        Student stu=new Student();
        stu.setSid(2);
        stu.setName("小紫");
//        stu.setAge(23);

        List<Student> list=mapper.selectCondition(stu);

        for (Student student :list){
            System.out.println(student);
        }

        sqlSession.close();
    }

}
