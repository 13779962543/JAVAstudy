package MyBatisStudy02.mapper;

import MyBatisStudy02.bean.Student;

import java.util.List;

/*
持久层接口
 */
public interface StudentMapper02 {
    //查询全部
    public abstract List<Student> selectAll();
    //根据id查询
    public abstract Student selectById(Integer id);
    //新增数据
    public abstract Integer insert(Student stu);
    //修改数据
    public abstract Integer update(Student stu);
    //删除数据
    public abstract Integer delete(Integer id);
    //多条件查询
    public abstract List<Student> selectCondition(Student stu);
    //根据多个id进行查询
    public abstract List<Student> selectByIds(List<Integer> ids);
}
