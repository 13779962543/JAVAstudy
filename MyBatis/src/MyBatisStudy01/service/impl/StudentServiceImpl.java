package MyBatisStudy01.service.impl;

import MyBatisStudy01.bean.Student;
import MyBatisStudy01.mapper.StudentMapper;
import MyBatisStudy01.mapper.impl.StudentMapperImpl;
import MyBatisStudy01.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //创建持久层对象
    private StudentMapper mapper=new StudentMapperImpl();

    /*
   查询全部
    */
    @Override
    public List<Student> selectAll(){
        return mapper.selectAll();
    }
    /*
    根据id进行查询
     */
    @Override
    public Student selectById(Integer id){
        return mapper.selectById(id);
    }
    /*
    新增功能
     */
    @Override
    public Integer insert(Student stu){
        return mapper.insert(stu);
    }
    /*
  修改功能
   */
    @Override
    public Integer update(Student stu){
        return mapper.update(stu);
    }
    /*
    删除功能
     */
    @Override
    public Integer delete(Integer id){
        return mapper.delete(id);
    }

}
