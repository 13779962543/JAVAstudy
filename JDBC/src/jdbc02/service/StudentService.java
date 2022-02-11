package jdbc02.service;

import jdbc02.domain.Student;

import java.util.ArrayList;

public interface StudentService {
    public abstract ArrayList<Student> findAll();
    public abstract Student findById(Integer id);
    //新增学生信息
    public abstract int insert(Student stu);
    //修改学生信息
    public abstract int update(Student stu);
    //删除学生信息
    public abstract int delete(Integer id);
}
