package MyBatisStudy03.table01;

import MyBatisStudy02.bean.Student;
import MyBatisStudy02.mapper.StudentMapper02;
import MyBatisStudy03.bean.Card;
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
    public void selectAll() throws Exception{
        InputStream is = Resources.getResourceAsStream("MyBatisConfig03.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取OneToOneMapper接口的实现类对象
        OneToOneMapper mapper = sqlSession.getMapper(OneToOneMapper.class);

        List<Card> list=mapper.selectAll();

        for (Card c :list){
            System.out.println(c);
        }

        sqlSession.close();
    }
}
