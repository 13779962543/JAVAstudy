package MyBatisStudy02.paging;

import MyBatisStudy02.bean.Student;
import MyBatisStudy02.mapper.StudentMapper02;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public void selectPaging() throws Exception{
        InputStream is = Resources.getResourceAsStream("MyBatisConfig02.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        StudentMapper02 mapper = sqlSession.getMapper(StudentMapper02.class);

        //通过分页助手来实现分页功能
        //第一页:显示3条数据
//        PageHelper.startPage(1,3);
        //第二页:显示3条数据
//        PageHelper.startPage(2,3);
        //第三页:显示3条数据
        PageHelper.startPage(3,3);

//        stu.setAge(23);

        List<Student> list=mapper.selectAll();

        for (Student student :list){
            System.out.println(student);
        }

        //获取分页相关参数
        PageInfo<Student> info=new PageInfo<>(list);
        System.out.println("总条数:"+info.getTotal());
        System.out.println("总页数:"+info.getPages());
        System.out.println("当前页:"+info.getPageNum());
        System.out.println("每页显示条数:"+info.getPageSize());
        System.out.println("上一页:"+info.getPrePage());
        System.out.println("下一页:"+info.getNextPage());
        System.out.println("是否是第一条:"+info.isIsFirstPage());
        System.out.println("是否是最后一页:"+info.isIsLastPage());

        //释放数据
        sqlSession.close();
    }
}
