package MyBatisStudy02.service.impl;

import MyBatisStudy02.bean.Student;
import MyBatisStudy02.mapper.StudentMapper02;
//import MyBatisStudy02.mapper.impl.StudentMapperImpl;
import MyBatisStudy02.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    /*
   查询全部
    */
    @Override
    public List<Student> selectAll(){
        List<Student> list=null;
        SqlSession sqlSession=null;
        InputStream is=null;
        try {
            //1.加载核心配置文件
            is= Resources.getResourceAsStream("MyBatisConfig02.xml");
            //2.获取SqlSession工厂对象
            SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取SqlSession对象
            sqlSession=sqlSessionFactory.openSession(true);
            //4.获取SudentMapper接口的实现类对象
            StudentMapper02 mapper=sqlSession.getMapper(StudentMapper02.class);  //StudentMapper mapper=new StudentMapperImpl();
            //5.通过实现类对象调用方法，接收结果
            list=mapper.selectAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //6.释放资源
            if(sqlSession!=null){
                sqlSession.close();
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //7.返回结果
        return list;
    }
    /*
    根据id进行查询
     */
    @Override
    public Student selectById(Integer id){
        Student stu=null;
        SqlSession sqlSession=null;
        InputStream is=null;
        try {
            //1.加载核心配置文件
            is= Resources.getResourceAsStream("MyBatisConfig02.xml");
            //2.获取SqlSession工厂对象
            SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取SqlSession对象
            sqlSession=sqlSessionFactory.openSession(true);
            //4.获取SudentMapper接口的实现类对象
            StudentMapper02 mapper=sqlSession.getMapper(StudentMapper02.class);  //StudentMapper mapper=new StudentMapperImpl();
            //5.通过实现类对象调用方法，接收结果
            stu=mapper.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //6.释放资源
            if(sqlSession!=null){
                sqlSession.close();
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //7.返回结果
        return stu;

    }
    /*
    新增功能
     */
    @Override
    public Integer insert(Student stu){
        Integer result=null;
        SqlSession sqlSession=null;
        InputStream is=null;
        try {
            //1.加载核心配置文件
            is= Resources.getResourceAsStream("MyBatisConfig02.xml");
            //2.获取SqlSession工厂对象
            SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取SqlSession对象
            sqlSession=sqlSessionFactory.openSession(true);
            //4.获取SudentMapper接口的实现类对象
            StudentMapper02 mapper=sqlSession.getMapper(StudentMapper02.class);  //StudentMapper mapper=new StudentMapperImpl();
            //5.通过实现类对象调用方法，接收结果
            result=mapper.insert(stu);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //6.释放资源
            if(sqlSession!=null){
                sqlSession.close();
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //7.返回结果
        return result;
    }
    /*
  修改功能
   */
    @Override
    public Integer update(Student stu){
        Integer result=null;
        SqlSession sqlSession=null;
        InputStream is=null;
        try {
            //1.加载核心配置文件
            is= Resources.getResourceAsStream("MyBatisConfig02.xml");
            //2.获取SqlSession工厂对象
            SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取SqlSession对象
            sqlSession=sqlSessionFactory.openSession(true);
            //4.获取SudentMapper接口的实现类对象
            StudentMapper02 mapper=sqlSession.getMapper(StudentMapper02.class);  //StudentMapper mapper=new StudentMapperImpl();
            //5.通过实现类对象调用方法，接收结果
            result=mapper.update(stu);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //6.释放资源
            if(sqlSession!=null){
                sqlSession.close();
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //7.返回结果
        return result;
    }
    /*
    删除功能
     */
    @Override
    public Integer delete(Integer id){
        Integer result=null;
        SqlSession sqlSession=null;
        InputStream is=null;
        try {
            //1.加载核心配置文件
            is= Resources.getResourceAsStream("MyBatisConfig02.xml");
            //2.获取SqlSession工厂对象
            SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取SqlSession对象
            sqlSession=sqlSessionFactory.openSession(true);
            //4.获取SudentMapper接口的实现类对象
            StudentMapper02 mapper=sqlSession.getMapper(StudentMapper02.class);  //StudentMapper mapper=new StudentMapperImpl();
            //5.通过实现类对象调用方法，接收结果
            result=mapper.delete(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //6.释放资源
            if(sqlSession!=null){
                sqlSession.close();
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //7.返回结果
        return result;
    }

}
