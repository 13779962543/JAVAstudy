package jdbc02.service;

import jdbc02.dao.StudentDao;
import jdbc02.dao.StudentDaoImpl;
import jdbc02.domain.Student;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService{
    private StudentDao dao=new StudentDaoImpl();
    /*
    查询所有学生信息
     */
    @Override
    public ArrayList<Student> findAll(){
        return dao.findAll();
    }
    /*
    条件查询，根据id查询学生条件
     */
    @Override
    public Student findById(Integer id){
        return dao.findById(id);
    }
    /*
    添加学生信息
     */
    @Override
    public int insert(Student stu){
        return dao.insert(stu);
    }
    /*
    修改学生信息
     */
    @Override
    public int update(Student stu){
        return dao.update(stu);
    }
    /*
    删除学生信息
     */
    @Override
    public int delete(Integer id){
        return dao.delete(id);
    }
}
